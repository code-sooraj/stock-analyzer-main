package com.conserwit.stock.analyzer.main.data.yahoo;

import lombok.Data;

@Data
public class ExercisedValue {
    private int raw;
    private Object fmt;
    private String longFmt;
}
