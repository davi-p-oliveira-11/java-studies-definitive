/*
  4) Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
*/

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome  da primeira pessoa?");
        String nome1 = scanner.nextLine();

        System.out.print("Qual a idade da primeira pessoa?");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual o nome da segunda pessoa?");
        String nome2 = scanner.nextLine();

        System.out.print("Qual a idade da segunda pessoa ?");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.printf("A diferenca da idade entre %s e %s é de %d anos.%n", nome1, nome2, diferenca);

        scanner.close();
    }
}
