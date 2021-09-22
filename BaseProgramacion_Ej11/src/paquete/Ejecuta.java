package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   /*
		    11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
			como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
			el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
			año de nacimiento.
		    */
		
		
		int anyoNacimiento;
		String nombre;
		String nombreMenor = "";
		int suma = 0;
		int edad;
		int contEdad = 0;
		float media;
		int menor = Integer.MAX_VALUE;
		boolean continuar = true;
		Calendar calendario;
		Scanner sc;
		
		sc = new Scanner(System.in);
		calendario = Calendar.getInstance();
		
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		
		do {
			
			System.out.println("Introduzca nombre:");
			nombre = sc.nextLine();
			
			if(nombre.equals("fin")) {
				continuar = false;
			}else {
				System.out.println("Introduzca año de nacimiento:");
				anyoNacimiento = Integer.valueOf(sc.nextLine());
				
				edad = anyoActual-anyoNacimiento;
				contEdad++;
				suma = suma + edad;
				
				if(edad<menor)  {
					menor = edad;
					nombreMenor = nombre;
				}
			}

		}while(continuar==true);
		
		System.out.println("Fin");
		
		if(contEdad>0) {
			media = (float)suma/contEdad;
			System.out.println("El más joven se llama " + nombreMenor + " y la media es " + media);
		}
		
	}

}
