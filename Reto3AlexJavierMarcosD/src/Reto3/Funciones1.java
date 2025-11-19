package Reto3;

import java.util.Scanner;

public class Funciones1 {

	public static void nombres(Scanner sc) {
		String nombre;
		String pcorta = "DSUFUOGDFISDGVI";
		String palfabetica = "z";
		do {
			System.out.println("Dime un nombre");
			nombre = sc.nextLine();
			String nombreFormateado = "";
			if (nombre.length() > 0) {
				nombreFormateado = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1).toLowerCase();
			}
			if (nombre.length() < pcorta.length()) {
				pcorta = nombre;
			}
			if (nombre.compareTo(palfabetica) < 0) {
				palfabetica = nombre;
			}
			System.out.println(nombreFormateado);
			System.out.println("La alfabeticamente primera es " +palfabetica);

			if (pcorta.isBlank() == true) {
				continue;
			}
			System.out.println("El nombre mas corto es " +pcorta);
			
		} while (nombre != "");
		System.out.println("Fin");
	
	}
}
