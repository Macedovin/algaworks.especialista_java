public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {

        return totalAssentos - assentosReservados;
    }

//  -> Mudando os STATUS da aeronave (INSTÂNCIA)
    void desativar() {

        /*
//        -> Caso existisse nova REGRA DE NEGÓCIO associada, estaria aqui
        if (assentosReservados > 0) {

            // Faça alguma coisa
        } else {

            ativo = false;
        }*/
        ativo = false;
    }

    void ativar() {

        ativo = true;
    }

    void reservarAssentos(int numeroAssentos) {

        if (ativo) {

            assentosReservados += numeroAssentos;
        } else {
            // Existe uma forma de se fazer isso -> EXCEÇÕES
            // - Ainda não foi estudado
            System.out.println("Aeronave desativada. Assentos não reservados.");
        }

    }
}
