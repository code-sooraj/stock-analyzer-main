package com.conserwit.stock.analyzer.stock.analyzer.main;

import com.conserwit.stock.analyzer.stock.analyzer.main.data.db.Stock;
import com.conserwit.stock.analyzer.stock.analyzer.main.service.StockMetadataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class StockAnalyzerMainController {

    private StockMetadataService metadataService;

    @RequestMapping(value = "/{symbol}/analyze", method = RequestMethod.GET)
    public String analyze(@PathVariable("symbol") String tickerSymbol) {
        return "Completed analysis for stock " + tickerSymbol;
    }

    @RequestMapping(value = "/favorites", method = RequestMethod.GET)
    public List<Stock> getFavorites() {
        return metadataService.getAllStockMetadata();
    }

}
