import factories.*;
import services.ServicePagamento;

public class Main {
    
    public static void main(String[] args) {
        ServicePagamento service = new ServicePagamento();
        
        service.processarPagamento(new FabricaPix(), 150.00);
        
        service.processarPagamento(new FabricaBoletoBancario(), 250.00);
        
        service.processarPagamento(new FabricaCartaoCredito(), 350.00);
        
    }
}
    