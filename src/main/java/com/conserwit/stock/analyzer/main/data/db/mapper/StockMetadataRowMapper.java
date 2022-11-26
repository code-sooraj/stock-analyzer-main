package com.conserwit.stock.analyzer.main.data.db.mapper;

import com.conserwit.stock.analyzer.main.data.db.Stock;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StockMetadataRowMapper implements RowMapper<Stock> {

    @Override
    public Stock mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Stock stock = new Stock();
        stock.setId(resultSet.getInt("STOCK_ID"));
        stock.setSymbol(resultSet.getString("TICKER_SYMBOL"));
        stock.setName(resultSet.getString("STOCK_NAME"));
        stock.setExchange(resultSet.getString("EXCHANGE"));
        stock.setCountry(resultSet.getString("COUNTRY_CODE"));
        stock.setCurrency(resultSet.getString("CURRENCY_CODE"));
        stock.setFoundedYear(resultSet.getString("FOUNDED_YEAR"));
        return stock;
    }

}
