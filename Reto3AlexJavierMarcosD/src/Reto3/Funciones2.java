package Reto3;

import java.util.Scanner;

public class Funciones2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("1. Otra opción");
	            System.out.println("2. Procesar frase");
	            System.out.println("3. Salir");
	            int opcion = scanner.nextInt();
	            scanner.nextLine(); 
	            if (opcion == 2) {
	                System.out.print("Introduce una frase: ");
	                String frase = scanner.nextLine() + " ";
	                int palabras = 0;
	                for (int i = 0; i < frase.length(); i++) {
	                    if (frase.charAt(i) != ' ' && (i == frase.length()-1 || frase.charAt(i + 1) == ' ')) {
	                        palabras++;
	                    }
	                }
	                System.out.println("Cantidad de palabras: " + palabras);
	                String invertida = "";
	                String palabra = "";
	                for (int i = 0; i < frase.length(); i++) {
	                    if (frase.charAt(i) != ' ') {
	                        palabra += frase.charAt(i);
	                    } else if (!palabra.equals("")) {
	                        invertida = palabra + " " + invertida;
	                        palabra = "";
	                    }
	                }
	                System.out.println("Frase invertida: " + invertida.trim());
	                String larga = "";
	                palabra = "";
	                for (int i = 0; i < frase.length(); i++) {
	                    if (frase.charAt(i) != ' ') {
	                        palabra += frase.charAt(i);
	                    } else {
	                        if (palabra.length() > larga.length()) larga = palabra;
	                        palabra = "";
	                    }
	                }
	                System.out.println("Palabra más larga: " + larga);
	            } else if (opcion == 3) {
	                break;
	            }
	        }
	    }
	}

