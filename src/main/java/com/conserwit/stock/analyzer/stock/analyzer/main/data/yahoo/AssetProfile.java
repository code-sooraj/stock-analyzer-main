package com.conserwit.stock.analyzer.stock.analyzer.main.data.yahoo;

import lombok.Data;

import java.util.List;

@Data
public class AssetProfile {
    private String address1;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String website;
    private String industry;
    private String sector;
    private String longBusinessSummary;
    private int fullTimeEmployees;
    private List<CompanyOfficer> companyOfficers;
    private int auditRisk;
    private int boardRisk;
    private int compensationRisk;
    private int shareHolderRightsRisk;
    private int overallRisk;
    private int governanceEpochDate;
    private int compensationAsOfEpochDate;
    private int maxAge;
}
