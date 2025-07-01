/*
  1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima
  na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */


import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome ? ");
        String nome = scanner.nextLine();

        System.out.println("Qual o seu ano de nascimento ?");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá %s voce tem %d anos", nome, idade);

        scanner.close();

    }
}
