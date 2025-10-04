package models;

import interfaces.Transporte;

public class Aereo implements Transporte{
    
    @Override
    public  double calcularValor(double tipoCalculo) {
        return tipoCalculo * 0.75;
    }
}
