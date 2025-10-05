package services;

import factories.FabricaPagamento;


public class ServicePagamento {
    
    public void processarPagamento(FabricaPagamento fabrica, double valor) {
        var pagamento = fabrica.criarPagamento();
        pagamento.realizarPagamento(valor);
    }
}
