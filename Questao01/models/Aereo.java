package models;

import interfaces.Transporte;

public class Aereo implements Transporte{
    
    // implementação do método calcularValor para transporte aéreo
    @Override
    public  double calcularValor(double tipoCalculo) {
        return tipoCalculo * 0.75;
    }
}
