public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

//        Definindo ATRIBUTOS do OBEJTO meuCarro
        meuCarro.anoFabricacao = 2023;
        meuCarro.cor = "preto";
        meuCarro.modelo = "HR-V";
        meuCarro.fabricante = "Honda";

        Carro seuCarro = new Carro();

        seuCarro.anoFabricacao = 2021;
        seuCarro.cor = "Branco";
        seuCarro.modelo = "X6";
        seuCarro.fabricante = "BMW";

        System.out.println("Meu carro");
        System.out.println("------------------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println(); //-> Linha em branco/ QUEBRA DE LINHA

        System.out.println("Seu carro");
        System.out.println("------------------------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
    }
}
