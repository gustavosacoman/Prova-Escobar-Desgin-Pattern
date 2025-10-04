package factories;

import interfaces.Transporte;
import models.Aereo;

public class FabricaAerea extends FabricaTransporte {

    @Override
    public Transporte criarTransporte() {
        return new Aereo();
    }
    
}
