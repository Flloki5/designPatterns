package com.flloki.patterns.structural.adapter.example2;

public class ERP2ToLegacySystemAdapterImpl implements ERP2ToLegacySystemAdapter{

    private ERPAccountancyBusinessSystemImpl legacySystem;

    public ERP2ToLegacySystemAdapterImpl(ERPAccountancyBusinessSystemImpl legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void submitTimeFor(Employee employee, MonthReport monthReport, Project project) {
//        legacySystem.track_Time_For_Employee_Month(
////                (double) employee.getId(),
////                monthReport.getMonth().name()
//                //etc
//
//        );
    }
}
