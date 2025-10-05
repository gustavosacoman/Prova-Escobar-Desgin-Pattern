package models;
import interfaces.Pagamentos;
public class BoletoBancario implements Pagamentos{
    
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Processando pagamento com Boleto Bancário no valor de: R$" + valor);
    }
    
}
