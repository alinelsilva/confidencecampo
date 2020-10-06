package br.com.confidencecambio.javabasico;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		double peso;
		double altura;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o seu peso (Ex:1,0): ");
		peso = s.nextDouble();
		
		System.out.println("Informe o sua altura (Ex:1,0): ");
		altura = s.nextDouble();
		
		double imc;
		
		imc = peso / (altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do Peso");
			
		} else if(imc >= 18.6 && imc <= 24.9) {
			System.out.println("Saudável");
			
		} else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Peso em Excesso");
			
		} else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
			
		} else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa)");
			
		} else {
			System.out.println("Obesidade Grau III (mórbida)");
		}
		
		
	}
	
	

}
