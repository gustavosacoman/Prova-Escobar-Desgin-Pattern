import factories.*;
import services.ServicePagamento;

public class Main {
    
    public static void main(String[] args) {
        ServicePagamento service = new ServicePagamento();
        
        FabricaPagamento fabricaPix = new FabricaPix();
        service.processarPagamento(fabricaPix, 150.00);
        
        FabricaPagamento fabricaBoleto = new FabricaBoletoBancario();
        service.processarPagamento(fabricaBoleto, 250.00);
        
        FabricaPagamento fabricaCartao = new FabricaCartaoCredito();
        service.processarPagamento(fabricaCartao, 350.00);
    }
}
    