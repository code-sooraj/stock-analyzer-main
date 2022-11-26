package com.conserwit.stock.analyzer.main.service;

import com.conserwit.stock.analyzer.main.data.db.Stock;
import com.conserwit.stock.analyzer.main.repository.StockMetadataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class StockMetadataService {
    private StockMetadataRepository metadataRepository;

    public List<Stock> getAllStockMetadata() {
        return metadataRepository.findAll().collect(Collectors.toList());
    }
}
