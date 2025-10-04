package factories;

import interfaces.Pagamentos;
import models.BoletoBancario;

public class FabricaBoletoBancario extends FabricaPagamento {

    @Override
    public Pagamentos criarPagamento() {
        return new BoletoBancario();
    }
    
}
