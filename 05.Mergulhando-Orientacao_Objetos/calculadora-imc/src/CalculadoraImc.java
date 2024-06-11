public class CalculadoraImc {

// REMOVIDAS as VARIÁVEIS DE INSTÂNCIA que não fazem mais sentido com a CLASSE

//  -> MÉTODO que retorna um OBJETO
//    Agora com ARGUMENTOS/ PARÂMETROS
//    IndiceMassaCorporal calcular(double peso, double altura) {
//    - ARGUMENTO/ PARÂMETRO agora é um OBJETO único
        IndiceMassaCorporal calcular(Paciente paciente) {

//      -> Novo OBJETO de escopo no MÉTODO
        IndiceMassaCorporal imc = new IndiceMassaCorporal();

//      -> Atribuindo VALORES as PROPRIEDADES DO OBJETO
//        - Referenciando NOVO OBJETO que contem os valores
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }
}