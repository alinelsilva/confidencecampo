package br.com.confidencecambio.javabasico;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Robo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = s.nextLine().trim().replaceAll("\\s+(d[aeo]s?)", "");

		if (nome == null || nome.isEmpty()) {
			System.out.println("Nome null/vazio");

		} else {
			// nome maiúsculo
			System.out.println("\n***Nome Maiúsculo***");
			System.out.println(nome.toUpperCase());

			//primeiro nome
			System.out.println("\n***Primeiro Nome***");
			String pattern = "\\S+"; // Um caractere diferente de espaço em branco podendo ter 1 ou mais
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(nome);
			if (m.find()) {
				System.out.println(m.group(0).substring(0, 1)
						.toUpperCase() + m.group().substring(1)); // deixara apenas a primeira leitra em  maiúscula
			}
			
			//ultimo nome
			System.out.println("\n***Último Nome***");
			String[] texto = nome.split(" "); // Separa cada nome pelo espaço
			for(int i = 1; i< texto.length; i++) {
				System.out.printf(texto[i].substring(0, 1)
						.toUpperCase() + texto[i].substring(1) +" ");
			}
			
			//nome abreviado
			System.out.println("\n\n***Nome Abreviado***");
			String primeiro = "";
			String meio = " "; 
			String ultimo = "";
			
			primeiro = texto[0];
			
			for (int i = 1; i < texto.length - 1; i++) 
			{
				meio += texto[i].substring(0, 1).toUpperCase(); // Reserva a inicial do próximo nome.
			    meio += ". "; // Põe um ponto e um espaço após a inicial.
			    
			}
			ultimo = texto[texto.length-1]; // Reserva o ultimo nome.
			nome = primeiro + meio + ultimo; // Junta todos os nomes.
			
			System.out.println(nome.substring(0, 1).toUpperCase() + nome.substring(1));
			
			
		}

	}

}
