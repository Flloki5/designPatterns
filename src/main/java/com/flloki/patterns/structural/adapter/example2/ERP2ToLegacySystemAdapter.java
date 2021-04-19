package com.flloki.patterns.structural.adapter.example2;


public interface ERP2ToLegacySystemAdapter {

    void submitTimeFor(Employee employee, MonthReport monthReport, Project project);

}
