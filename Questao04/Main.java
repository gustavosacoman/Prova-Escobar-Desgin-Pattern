import interfaces.IReport;
import java.util.List;
import models.*;

public class Main {
    public static void main(String[] args) {

        List<String> items = List.of("Item1", "Item2", "Item3");
        IReport report = new Report(items);
        
        System.out.println(report.getDescription());

        report = new PDFExport(report);
        System.out.println(report.getDescription());

        report = new Graphics(report);
        System.out.println(report.getDescription());

        report = new BillingStatistics(report);
        System.out.println(report.getDescription());
    }
}
