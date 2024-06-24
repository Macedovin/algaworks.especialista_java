public class Principal {

    public static void main(String[] args) {

        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

//      -> Mudando STATUS da aeronave (INSTÂNCIA)
//        aviaoGol.ativo = false;

        aviaoGol.desativar();
        aviaoGol.ativar();

//        -> Reservando assentos (CHAMANDO o método)
        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponíveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());

    Aeronave aviaoLatam = new Aeronave();

    aviaoLatam.totalAssentos = 120;

//        -> Reservando assentos (CHAMANDO o método)
        aviaoLatam.reservarAssentos(5);

        System.out.printf("LATAM (%s): %d assentos disponíveis%n",
                aviaoLatam.ativo ? "Ativo" : "Inativo",
                aviaoLatam.calcularAssentosDisponiveis());
    }
}
