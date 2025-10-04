
import factories.FabricaAerea;
import factories.FabricaMaritima;
import factories.FabricaTerrestre;
import factories.FabricaTransporte;

public class Main {
    public static void main(String[] args) {
        
        FabricaTransporte fabrica = new FabricaTerrestre();
        System.out.println(fabrica.calcularFrete(50));

        FabricaTransporte fabricaAerea = new FabricaAerea();
        System.out.println(fabricaAerea.calcularFrete(50));

        FabricaTransporte fabricaMaritima = new FabricaMaritima();
        System.out.println(fabricaMaritima.calcularFrete(50));
    }
}
