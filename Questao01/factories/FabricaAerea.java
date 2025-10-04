package factories;

import interfaces.Transporte;
import models.Aereo;

public class FabricaAerea extends FabricaTransporte {

    // Implementação do método criarTransporte para transporte aéreo
    @Override
    public Transporte criarTransporte() {
        return new Aereo();
    }
    
}
