package factories;

import interfaces.Transporte;

// Classe abstrata que define o metodo criarTransporte
// e o metodo calcularFrete que utiliza o transporte criado
public abstract class FabricaTransporte  {

    // Criacao dos diferentes tipos de transporte para o calculo do frete
    public abstract  Transporte criarTransporte();

    // calculo do frete para o transporte deixando as classes genericas,
    // assim o programador pode usa-las genericamente com o retorno do valor

    public double calcularFrete(double value) {
        Transporte transporte = criarTransporte();
        return transporte.calcularValor(value);
    }
}
