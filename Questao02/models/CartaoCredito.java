package models;
import interfaces.Pagamentos;
public class CartaoCredito implements Pagamentos{
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com Cartão de Crédito no valor de: R$" + valor);
    }
}
