public class FolhaPagamento {

/*
    double calcularSalario(int horasNormais, int horasExtras,
                           double valorHoraNormal, double valorHoraExtra) {
*/
//    -> REFATORANDO a ASSINATURA do método
    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contratoTrabalho) {

//      -> Declarando VARIÁVEIS LOCAIS
        double salarioBase = horasNormais * contratoTrabalho.valorHoraNormal;
        double salarioExtra = horasExtras * contratoTrabalho.valorHoraExtra;

        double salarioDevido = salarioBase + salarioExtra;

        if (contratoTrabalho.possuiAdicionalParaFilhos()) {

            System.out.println("-> Tenho mais de um filho! ADICIONAL!");
/*
//          -> AQUI estaria calculando o RESULTADO/ VALOR dos 10%
            double adicionalDezPorcento = salarioDevido * 0.1;
            - E somando ao VALOR TOTAL
            salarioDevido = adicionalDezPorcento + salarioDevido;
*/
            salarioDevido *= 1.1; // RESOLUÇÃO em UMA LINHA (Multiplication assignment operator)
        }

//      -> Retorna o VALOR final
        return salarioDevido;
    }
}
