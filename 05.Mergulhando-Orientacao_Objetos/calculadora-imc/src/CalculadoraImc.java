public class CalculadoraImc {

// REMOVIDAS as VARIÁVEIS DE INSTÂNCIA que não fazem mais sentido com a CLASSE

//  -> MÉTODO que retorna um OBJETO
//    Agora com ARGUMENTOS/ PARÂMETROS
    IndiceMassaCorporal calcular(double peso, double altura) {

//      -> Novo OBJETO de escopo no MÉTODO
        IndiceMassaCorporal imc = new IndiceMassaCorporal();

//      -> Atribuindo VALORES as PROPRIEDADES DO OBJETO
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}