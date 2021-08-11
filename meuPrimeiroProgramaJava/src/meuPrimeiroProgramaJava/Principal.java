/* Meu primeiro programa Java*
	 
	  Este programa mostra ao aluno:
	  1) Que um programa Java e construido dentro de um projeto Java.
	  2) Todo programa Java deve ter uma classe com um metodo main.
	  3) Como exibir informacoes no terminal (console) do Java.
	  4) Como ler uma string do terminal (console) do Java.
	  
	 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Marchelo
 *
 */
public class Principal { // Classe que contem o metodo principal.
	public static void main(String[] args) { // Este e o metodo principal.

		System.out.println("Ola amigo!\nQual e o seu nome?"); // Uso do println
		
		// Ler uma string do console usando a biblioteca Scanner..
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir uma string usando printf.
		System.out.printf("Ola %s!\n", nome);

	}

}