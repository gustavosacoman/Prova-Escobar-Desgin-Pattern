package models;

import interfaces.IReport;

public abstract  class ReportDecorator implements IReport{
    protected IReport decoratedReport;

    public ReportDecorator(IReport decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    @Override
    public String getDescription() {
        return decoratedReport.getDescription();
    }
}
