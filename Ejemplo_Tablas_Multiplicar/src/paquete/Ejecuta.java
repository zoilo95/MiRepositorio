package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		int resultado;
		String fila;
		int suma = 0;
		
		for(int numero=1; numero<=10; numero++) {
			System.out.println("\nTabla del "  + numero + ":");
			suma = 0;
			for(int j=1; j<=10; j++) {
				resultado = numero * j;
				suma = suma + resultado;
				fila = numero + "     X     "  + j + "  =  " + resultado;
				System.out.println(fila);
			}
			System.out.println("================");
			System.out.println("La suma vale " + suma);
		}
		
	}

}
