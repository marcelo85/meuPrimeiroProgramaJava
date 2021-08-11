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
public class Principal {
	public static void main(String[] args) { 

		// Saldacao e pergunta o nome.
		System.out.println("Ola amigo!\nQual e o seu nome?"); 
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldacao especifica para o nome lido.
		System.out.printf("Ola %s!\n", nome);
		
		//Nota Implementar leitura da idade e exibir	
			
	}

}
