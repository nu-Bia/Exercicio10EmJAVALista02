//10) Ler dois valores (inteiros, reais ou caracteres) para as vari�veis A e B, e efetuar a troca dos valores 
//de forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da 
//vari�vel A. Apresentar os valores trocados.

import java.util.Scanner;

public class Exercicio10 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o primeiro valor");

int valor1 = sc.nextInt();

System.out.println("Digite o segundo valor");

int valor2 = sc.nextInt();


System.out.println ("O novo valor do valor 1 �:" + valor2);

System.out.println ("O novo valor do valor 2 �: " + valor1);
	
}
}

