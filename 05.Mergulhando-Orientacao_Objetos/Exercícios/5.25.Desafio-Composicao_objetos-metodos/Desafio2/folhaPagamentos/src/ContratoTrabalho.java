public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

//    boolean funcionarioTemUmOuMaisFilhos() {
//    -> Refatorando o nome do método
    boolean possuiAdicionalParaFilhos() {

        return funcionario.possuiFilhos();
    }
}
