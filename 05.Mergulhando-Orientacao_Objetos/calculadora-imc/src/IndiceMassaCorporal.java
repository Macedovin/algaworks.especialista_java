public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

//  -> Deixando a classe mais rica com MÉTODOS/ COMPORTAMENTOS

    boolean estaComObesidade() {

        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {

        return resultado < 18.5;
    }
}