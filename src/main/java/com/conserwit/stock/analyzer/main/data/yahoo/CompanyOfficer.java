package com.conserwit.stock.analyzer.main.data.yahoo;

import lombok.Data;

@Data
public class CompanyOfficer
{
    private int maxAge;
    private String name;
    private int age;
    private String title;
    private int yearBorn;
    private int fiscalYear;
    private TotalPay totalPay;
    private ExercisedValue exercisedValue;
    private UnexercisedValue unexercisedValue;
}
