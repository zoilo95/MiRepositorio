package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/*
		 12. Programa que muestra los n�meros primos existentes entre el 1 y el 100. NOTA: Un
		     n�mero es primo si tiene dos �nicos divisores que son el 1 y �l mismo.
		 */
		
		int numero;
		int resto;
		Scanner sc;
		boolean esPrimo = true;
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca n�mero");
		numero = sc.nextInt();
		
		for(int candidatoDivisor=2; candidatoDivisor<numero && esPrimo==true; candidatoDivisor++) {
			resto = numero%candidatoDivisor;
			if(resto==0) {
				esPrimo = false;
			}
		}
		
	}

}
