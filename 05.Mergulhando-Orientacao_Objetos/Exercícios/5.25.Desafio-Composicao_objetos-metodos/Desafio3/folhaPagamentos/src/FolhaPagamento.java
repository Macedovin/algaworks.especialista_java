public class FolhaPagamento {

/*
    double calcularSalario(int horasNormais, int horasExtras,
                           double valorHoraNormal, double valorHoraExtra) {
*/
//    -> REFATORANDO a ASSINATURA do método
    Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contratoTrabalho) {

        Holerite holerite = new Holerite();

//      -> define o FUNCIONÁRIO a ser referenciado
        holerite.funcionario = contratoTrabalho.funcionario;

//      -> REFATORANDO as variáveis para CONSTRUIR um OBBJETO a ser retornado
/*
//      -> Declarando VARIÁVEIS LOCAIS
        double salarioBase = horasNormais * contratoTrabalho.valorHoraNormal;
        double salarioExtra = horasExtras * contratoTrabalho.valorHoraExtra;

        double salarioDevido = salarioBase + salarioExtra;
*/
        holerite.valorTotalHorasNormais = horasNormais * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtras * contratoTrabalho.valorHoraExtra;

        double salarioBase = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contratoTrabalho.possuiAdicionalParaFilhos()) {

//          -> Agora o VALOR retornado é outro - Somete o ADICIONAL, não SALÁRIO + ADICIONAL
            holerite.valorAdicionalParaFilhos = salarioBase * 0.1; // RESOLUÇÃO em UMA LINHA (Multiplication assignment operator)
        }

//        -> Não preciso calcular aqui o VALOR TOTAL, mas EM UMA INSTÂNCIA
//          - Não é usado aqui
//        holerite.calcularValorTotal();

//      -> Retorna o OBJETO holerite
        return holerite;
    }
}
