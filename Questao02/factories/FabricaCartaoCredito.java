package factories;
import interfaces.Pagamentos;
import models.CartaoCredito;

public class FabricaCartaoCredito extends FabricaPagamento {

    @Override
    public Pagamentos criarPagamento() {
        return new CartaoCredito();
    }

}
