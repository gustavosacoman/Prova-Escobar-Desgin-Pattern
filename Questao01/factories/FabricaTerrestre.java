package factories;

import interfaces.Transporte;
import models.Terrestre;

public class FabricaTerrestre extends FabricaTransporte {

    // Implementação do método criarTransporte para transporte terrestre
    @Override
    public Transporte criarTransporte() {
        return new Terrestre();
    }
    
}
