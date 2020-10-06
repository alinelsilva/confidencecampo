package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {
	
	public String calculo(double iCalculo) {
		
		String resultado = "";
		if(iCalculo < 18.5) {
			resultado = "Abaixo do Peso";
			
		} else if(iCalculo >= 18.6 && iCalculo <= 24.9) {
			resultado ="Saudável";
			
		} else if(iCalculo >= 25 && iCalculo <= 29.9) {
			resultado= "Peso em Excesso";
			
		} else if(iCalculo >= 30 && iCalculo <= 34.9) {
			resultado = "Obesidade Grau I";
			
		} else if(iCalculo >= 35 && iCalculo <= 39.9) {
			resultado = "Obesidade Grau II (severa)";
			
		} else {
			resultado = "Obesidade Grau III (mórbida)";
		}
		return resultado;
		
	}
	
	
	

}
