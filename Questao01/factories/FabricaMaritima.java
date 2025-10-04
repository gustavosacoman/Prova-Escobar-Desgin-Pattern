package factories;

import interfaces.Transporte;
import models.Maritimo;

public class FabricaMaritima extends FabricaTransporte {

    @Override
    public Transporte criarTransporte() {
        return new Maritimo();
    }
    
}
