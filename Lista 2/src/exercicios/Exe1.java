/*Escreva um aplicativo que solicita ao usu�rio inserir dois n�meros inteiros e imprima a soma, subtra��o, divis�o e produto desses dois n�meros */

package exercicios;
import java.util.Scanner;

public class Exe1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int soma;
		int subtracao;
		int divisao;
		int multiplicacao;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		
		soma = num1 + num2;
		subtracao = num1 - num2;
		divisao = num1/num2;
		multiplicacao = num1 * num2;
		
		System.out.println("soma igual a: " + soma);
		System.out.println("subtra��o igual a: " + subtracao);
		System.out.println("Multiplicacao igual a: " + multiplicacao);
		System.out.println("Divis�o igual a: "  +divisao);
	}
}