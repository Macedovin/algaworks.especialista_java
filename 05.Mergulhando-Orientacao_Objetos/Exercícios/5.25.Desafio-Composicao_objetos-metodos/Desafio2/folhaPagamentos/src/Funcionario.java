public class Funcionario {

    String nome;
    int quantidadeFilhos;

//    boolean temUmOuMaisFilhosFilhos() {
//    -> REFATORANDO o nome do método
    boolean possuiFilhos() {

        return quantidadeFilhos >= 1;
    }
}
