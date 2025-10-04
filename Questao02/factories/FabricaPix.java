package factories;
import interfaces.Pagamentos;
import models.Pix;
public class FabricaPix extends FabricaPagamento {

    @Override
    public Pagamentos criarPagamento() {
        return new Pix();
    }
    
}
