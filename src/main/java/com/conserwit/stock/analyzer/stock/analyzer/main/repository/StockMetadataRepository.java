package com.conserwit.stock.analyzer.stock.analyzer.main.repository;

import com.conserwit.stock.analyzer.stock.analyzer.main.data.db.Stock;
import com.conserwit.stock.analyzer.stock.analyzer.main.data.db.mapper.StockMetadataRowMapper;
import com.conserwit.stock.analyzer.stock.analyzer.main.repository.queries.StockMetadataQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class StockMetadataRepository {

    private final NamedParameterJdbcTemplate template;
    private final StockMetadataQueries queries;
    private final RowMapper<Stock> rowMapper;
    private final SimpleJdbcInsert insert;

    @Autowired
    public StockMetadataRepository(NamedParameterJdbcTemplate template, StockMetadataQueries queries) {
        this.template = template;
        //this.rowMapper = new BeanPropertyRowMapper<>(Stock.class);
        this.rowMapper = new StockMetadataRowMapper();
        this.queries = queries;
        this.insert = new SimpleJdbcInsert(template.getJdbcTemplate());
        this.insert.setTableName("Stock");
        this.insert.usingGeneratedKeyColumns("id");
    }

    @Transactional
    public Stock insert(Stock stock) {
        //Number id = insert.executeAndReturnKey(new BeanPropertySqlParameterSource(Stock));
        Number id = insert.executeAndReturnKey(stock.toMap());
        return findBy(id.longValue()).orElseThrow(() -> new IllegalStateException(""));
    }

    public Optional<Stock> findBy(Long id) {
        String sql = queries.getFindById();
        Map<String, Object> parameters = Collections.singletonMap("id", id);
        return template.queryForStream(sql, parameters, rowMapper).findFirst();
    }

    @Transactional
    public boolean delete(Long id) {
        String sql = queries.getDeleteById();
        Map<String, Object> paramMap = Collections.singletonMap("id", id);
        return template.update(sql, paramMap) == 1;
    }

    @Transactional
    public boolean update(Stock stock) {
        String sql = queries.getUpdate();
        Map<String, Object> paramMap = stock.toMap();
        return template.update(sql, paramMap) == 1;
    }

    public Stream<Stock> findAll() {
        return template.queryForStream(queries.getFindAll(), new HashMap<>(0), rowMapper);
    }
}
