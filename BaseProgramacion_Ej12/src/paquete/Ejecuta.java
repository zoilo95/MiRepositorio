package paquete;


public class Ejecuta {

	public static void main(String[] args) {
		
		/*
		 12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		     número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 */
		
		int resto;
		boolean esPrimo = true;
		
		
		for(int numero=1; numero<=100; numero++) {
			
			esPrimo = true;
			
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
				System.out.println(numero);
			}
			
		}
				
	}

}
