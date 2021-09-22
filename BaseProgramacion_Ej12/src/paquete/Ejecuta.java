package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/*
		 12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		     número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 */
		
		int numero;
		int resto;
		Scanner sc;
		boolean esPrimo = true;
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca número");
		numero = sc.nextInt();
		
		if(numero<2) {
			esPrimo = false;
		}else {
			for(int candidatoDivisor=2; candidatoDivisor<numero && esPrimo==true; candidatoDivisor++) {
				resto = numero%candidatoDivisor;
				if(resto==0) {
					esPrimo = false;
				}
			}
		}
		
		if(esPrimo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
		sc.close();
		
	}

}
