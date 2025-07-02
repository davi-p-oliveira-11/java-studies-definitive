/*
* 3) Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela

fórmula: área=base X altura
*  */


import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a base do retangulo ?");
        double base = scanner.nextDouble();

        System.out.println("Qual a altura do retangulo ?");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retangulo é: %.1f metros", area);

        scanner.close();

    }
}
