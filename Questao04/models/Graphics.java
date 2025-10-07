package models;

import interfaces.IReport;

public class Graphics extends ReportDecorator {
    
    public Graphics(IReport decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " | Graphics added.";
    }
    
}
