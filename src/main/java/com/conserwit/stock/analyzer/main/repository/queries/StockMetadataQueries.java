package com.conserwit.stock.analyzer.main.repository.queries;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// https://dzone.com/articles/introduction-to-spring-boot-and-jdbctemplate-jdbc
@Component
public class StockMetadataQueries {

    @Getter
    @Value("${stock.query.find.by.id}")
    private String findById;

    @Getter
    @Value("${stock.query.delete.by.id}")
    private String deleteById;

    @Getter
    @Value("${stock.query.update}")
    private String update;

    @Getter
    @Value("${stock.query.find.all}")
    private String findAll;
}
