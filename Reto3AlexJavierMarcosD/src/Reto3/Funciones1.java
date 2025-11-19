package Reto3;

import java.util.Scanner;

public class Funciones1 {

	public static void nombres(Scanner sc) {
		String nombre;
		String pcorta = "DSUFUOGDFISDGVI";
		String palfabetica = "z";
		String p3;
		String n;
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
			do {
				try {
					p3=nombre.substring(0, 3);
					break;
				} catch (Exception e) {
				}
			} while (true);			
			int nletras = nombre.length();
			System.out.println(nombreFormateado);char ultimaLetra = nombre.charAt(nombre.length() - 1);
			System.out.println("La alfabeticamente primera es " +palfabetica);
			System.out.println(p3 +ultimaLetra +nletras);
			if (pcorta.isBlank() == true) {
				continue;
			}
			System.out.println("El nombre mas corto es " +pcorta);
			
		} while (nombre != "");	
	}
}
