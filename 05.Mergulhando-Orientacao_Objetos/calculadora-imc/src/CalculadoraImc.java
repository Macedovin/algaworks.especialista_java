public class CalculadoraImc {

    double peso;
    double altura;

/*    double calcularIndiceMassaCorporal() {

        double imcCalculado = peso / (altura * altura);

        return imcCalculado;
    }*/

//    Refatorando o MÉTODO para retornar um OBJETO
//    -> Refatorando também o NOME DO MÉTODO
    IndiceMassaCorporal calcular() {

//      -> Novo OBJETO de escopo no MÉTODO
        IndiceMassaCorporal imc = new IndiceMassaCorporal();

//      -> Atribuindo VALORES as PROPRIEDADES DO OBJETO
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}