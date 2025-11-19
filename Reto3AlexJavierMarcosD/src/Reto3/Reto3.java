package Reto3;

import Reto3.Funciones1;
import Reto3.Funciones2;
import Reto3.Funciones3;
import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salida = true;
		int menu = 0;
		do {
			System.out.println("Menu de Strings\n1. Palabras\n2. Frase\n3. Frase versión marcos\n0. Salir");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				Funciones1.nombres(sc);
				break;
			case 2:
				System.out.println("Escribe una frase");
				String frase = sc.nextLine();
				System.out.println(Funciones3.cifradoSimple(frase));
				System.out.println(Funciones3.contarVocales(frase));
				System.out.println(Funciones3.numerosEnFrase(frase));
				System.out.println(Funciones3.palabraCorta(frase));
				break;
			case 3:
				Funciones2.Funciones2(sc);
			case 0:
				salida = false;
			}
			try {
				
			} catch (Exception e) {
				System.out.println("Error");
			}
		} while (salida != false);
		sc.close();
	}

}
