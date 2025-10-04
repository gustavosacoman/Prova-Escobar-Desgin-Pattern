package factories;

import interfaces.Transporte;
import models.Maritimo;

public class FabricaMaritima extends FabricaTransporte {

    // Implementação do método criarTransporte para transporte marítimo
    @Override
    public Transporte criarTransporte() {
        return new Maritimo();
    }
    
}
