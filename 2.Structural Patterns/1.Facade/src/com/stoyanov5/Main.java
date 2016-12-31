package com.stoyanov5;

public class Main {

    public static void main(String[] args) {

        String tableName = "Salary";


        HelperFacade.generateReport(HelperFacade.DBTypes.MongoDB, HelperFacade.ReportTypes.PDF, tableName);

    }
}
