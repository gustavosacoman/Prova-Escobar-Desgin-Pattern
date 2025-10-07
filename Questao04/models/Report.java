package models;

import interfaces.IReport;
import java.util.List;

public class Report implements IReport {
    
    private List<String> items;
    
    public Report(List<String> items) {
        this.items = items;
    }
    
    @Override
    public String getDescription() {
        return "Base report with items: " + String.join(", ", items);
    }
    
}
