import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        CalculadoraImc calculadoraImc = new CalculadoraImc();

//        -> Utilizando a CLASSE Scanner
        Scanner entrada = new Scanner(System.in);

//  -> REFATORANDO as entradas para serem armazenadas em VARIÁVEIS
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

//  1. Passando VALORES LITERAIS como ARGUMENTO
//  IndiceMassaCorporal imc = calculadoraImc.calcular(75, 1.82);

//  2. Passando VARIÁVEIS que referenciam valores como ARGUMENTO
    IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

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