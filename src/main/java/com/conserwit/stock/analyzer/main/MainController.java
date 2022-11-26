package com.conserwit.stock.analyzer.main;

import com.conserwit.stock.analyzer.main.data.db.Stock;
import com.conserwit.stock.analyzer.main.service.StockMetadataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private StockMetadataService metadataService;

    @RequestMapping(value = "/stocks/analysis/{symbol}", method = RequestMethod.GET)
    public String getAnalysis(@PathVariable("symbol") String tickerSymbol) {
        return "Completed analysis for stock " + tickerSymbol;
    }

    @RequestMapping(value = "/stocks/analysis/{symbol}", method = RequestMethod.POST)
    public String createAnalysis(@PathVariable("symbol") String tickerSymbol) {
        return "Completed analysis for stock " + tickerSymbol;
    }

    @RequestMapping(value = "/stocks/analysis", method = RequestMethod.GET)
    public List<Stock> getFavorites() {
        return metadataService.getAllStockMetadata();
    }

}
