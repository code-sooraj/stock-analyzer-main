package com.conserwit.stock.analyzer.main.data.db;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Data
public class Stock {

    private int id;
    private String symbol;
    private String name;
    private String exchange;
    private String country;
    private String currency;
    private String foundedYear;

    public Map<String, Object> toMap() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id", this.id);
        parameters.put("symbol", this.symbol);
        parameters.put("name", this.name);
        parameters.put("exchange", this.exchange);
        parameters.put("country", this.country);
        parameters.put("currency", this.currency);
        parameters.put("foundedYear", this.foundedYear);
        return parameters;
    }

    @Override
    public String toString() {
        return new StringBuilder("Stock [ ")
                .append("id = ").append(this.id).append(" , ")
                .append("symbol = ").append(this.symbol).append(" , ")
                .append("name = ").append(this.name).append(" , ")
                .append("exchange = ").append(this.exchange).append(" , ")
                .append("country = ").append(this.country).append(" , ")
                .append("currency = ").append(this.currency).append(" , ")
                .append("foundedYear = ").append(this.foundedYear).append(" ] ")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stock stock = (Stock) o;
        return Objects.equals(id, stock.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
