package models;
import interfaces.Pagamentos;
public class Pix implements Pagamentos {
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com Pix no valor de: R$" + valor);
    }
}
