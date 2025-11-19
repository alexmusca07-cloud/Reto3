package Reto3;

public class Funciones3 {
	
	public static String numerosEnFrase(String frase) {
		String numeros = "";
		int contador = 0;
		for (int a = 0; a < frase.length(); a++) {
			char c = frase.charAt(a);
			if(Character.isDigit(c)) {
				contador++;
				if(contador == 1) {
					numeros += c;
				} else {
					numeros += ("," + c);
				}
			}
		}
		return numeros;
	}

	public static String cifradoSimple(String frase) {
		frase = frase.toLowerCase();
		for (int a = 0; a < frase.length(); a++) {
			char letra = frase.charAt(a);
			if (letra == 'a' || letra == 'á') {
				frase = frase.replace(letra, '4');
			} else if (letra == 'e' || letra == 'é') {
				frase = frase.replace(letra, '3');
			} else if (letra == 'i' || letra == 'í') {
				frase = frase.replace(letra, '1');
			} else if (letra == 'o' || letra == 'ó') {
				frase = frase.replace(letra, '0');
			} else if (letra == 'u' || letra == 'ú') {
				frase = frase.replace(letra, '_');
			}

		}
		return frase;
	}

	public static String palabraCorta(String frase) {
		String pCorta = "";
		String contarLetras = "";
		for (int a = 0; a < frase.length(); a++) {
			char c = frase.charAt(a);
			if(Character.isWhitespace(c) == true) {
				if(contarLetras.length() < pCorta.length()) {
					pCorta = contarLetras;
				}
				contarLetras = "";
			} else {
				contarLetras += c;
			}
		}
			return pCorta;
	}

	public static int contarVocales(String frase) {
		int contador = 0;
		int contadorMenor = 1000000000;
		String vocales = "aeiouáéíóú";
		for (int a = 0; a < frase.length(); a++) {
			char letra = frase.charAt(a);
			if(Character.isWhitespace(letra) == true) {
				if (contador < contadorMenor) {
					contadorMenor = contador;
				}
			contador = 0;
			} else if (vocales.contains(String.valueOf(letra))) {
				contador++;
			}
		}
		return contadorMenor;
	}

}
