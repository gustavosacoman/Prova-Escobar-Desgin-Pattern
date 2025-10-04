package interfaces;


// Utilizacao de interface para definir o tipo do metodo calcularValor
// e garantir que todas as classes que implementam essa interface tenham esse metodo
public interface Transporte {

    // Metodo para calcular o valor do frete e retorna o valor apos o calculo
    double calcularValor(double tipoCalculo);
}