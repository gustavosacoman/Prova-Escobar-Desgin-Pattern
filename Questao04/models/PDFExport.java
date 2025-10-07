package models;

import interfaces.IReport;

public class PDFExport extends ReportDecorator {
    
    public PDFExport(IReport decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " | Exported to PDF.";
    }
    
}
