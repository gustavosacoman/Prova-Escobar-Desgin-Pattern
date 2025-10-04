package models;

import interfaces.Transporte;

public class Maritimo implements  Transporte {

    // implementação do método calcularValor para transporte marítimo
    @Override
    public double calcularValor(double tipoCalculo) {
        return tipoCalculo * 0.25;
    }
}
