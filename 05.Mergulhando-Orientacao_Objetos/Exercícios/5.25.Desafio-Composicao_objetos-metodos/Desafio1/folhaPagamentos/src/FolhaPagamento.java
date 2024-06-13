public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras,
                           double valorHoraNormal, double valorHoraExtra) {

//      -> Declarando VARIÁVEIS LOCAIS
        double salarioBase = horasNormais * valorHoraNormal;
        double salarioExtra = horasExtras * valorHoraExtra;

//      -> Calcula e retorna o VALOR final
        return salarioBase + salarioExtra;
    }
}
