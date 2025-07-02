/*
* 2)Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
fórmula: área=lado X lado
*
* */

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lado do quadrado ");
        int lado = scanner.nextInt();

        int area = lado * lado;

        System.out.printf("A área do quadrado é %s metros", area);

        scanner.close();

    }
}
