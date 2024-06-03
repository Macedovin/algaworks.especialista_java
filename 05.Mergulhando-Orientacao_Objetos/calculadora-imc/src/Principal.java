import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Paciente paciente = new Paciente();

/*      -> HARD CODED

        paciente.altura = 1.82;
        paciente.peso = 75;*/

//        -> Utilizando a CLASSE Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        paciente.altura = entrada.nextDouble();

        System.out.println("Digite seu peso: ");
        paciente.peso = entrada.nextDouble();

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.estaComObesidade()) {

            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade.%n", imc.altura, imc.peso);
        } else if (imc.estaAbaixoDoPesoIdeal()) {

            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está abaixo do peso ideal.%n", imc.altura, imc.peso);
        } else {

            System.out.printf("IMC normal: %.2f%n", imc.resultado);
        }
    }
}