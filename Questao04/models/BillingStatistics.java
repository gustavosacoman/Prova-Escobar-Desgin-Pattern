package models;

import interfaces.IReport;
public class BillingStatistics extends ReportDecorator {
    
    public BillingStatistics(IReport decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " | Billing statistics added.";
    }

}