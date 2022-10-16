package com.conserwit.stock.analyzer.stock.analyzer.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockAnalyzerMainController {

    @RequestMapping("/{symbol}/analyze")
    public String analyze(@PathVariable("symbol") String tickerSymbol) {
        return "Completed analysis for stock " + tickerSymbol;
    }
}
