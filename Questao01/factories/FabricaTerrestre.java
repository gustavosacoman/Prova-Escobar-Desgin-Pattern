package factories;

import interfaces.Transporte;
import models.Terrestre;

public class FabricaTerrestre extends FabricaTransporte {

    @Override
    public Transporte criarTransporte() {
        return new Terrestre();
    }
    
}
