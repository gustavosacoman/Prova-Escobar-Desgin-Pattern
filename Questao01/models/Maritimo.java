package models;

import interfaces.Transporte;

public class Maritimo implements  Transporte {

    @Override
    public double calcularValor(double tipoCalculo) {
        return tipoCalculo * 0.25;
    }
}
