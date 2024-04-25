public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Totó";
        cachorro1.raca = "poodle";
        cachorro1.sexo = 'M';
        cachorro1.idade = 3;

        cachorro2.nome = "Soffy";
        cachorro2.raca = "yorkshire";
        cachorro2.sexo = 'F';
        cachorro2.idade = 10;

        System.out.println("REGISTRO DE CACHORROS");

        System.out.println(); // Linha em branco

        System.out.println("---------------------------------");

        System.out.println(); // Linha em branco

        System.out.println("CACHORRO 1:");

        System.out.println("---------------------------------");

        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Idade: %d%n", cachorro1.idade);
        System.out.printf("Sexo: %c%n", cachorro1.sexo);
        System.out.printf("Raça: %s%n", cachorro1.raca);

        System.out.println(); // Linha em branco

        System.out.println("CACHORRO 2:");

        System.out.println("---------------------------------");

        System.out.println(); // Linha em branco

        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Idade: %d%n", cachorro2.idade);
        System.out.printf("Sexo: %c%n", cachorro2.sexo);
        System.out.printf("Raça: %s%n", cachorro2.raca);
    }
}
