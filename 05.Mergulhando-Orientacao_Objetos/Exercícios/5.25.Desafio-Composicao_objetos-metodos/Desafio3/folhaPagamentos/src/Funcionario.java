public class Funcionario {

    String nome;
    int quantidadeFilhos;

//    boolean temUmOuMaisFilhosFilhos() {
//    -> REFATORANDO o nome do método
    boolean possuiFilhos() {

//      -> REFATORA a condição onde MAIOR OU IGUAL A 1 (um) é o mesmo que MAIOR QUE 0 (zero)
        return quantidadeFilhos > 0;
    }
}
