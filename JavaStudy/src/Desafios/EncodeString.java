package Desafios;

import java.util.HashMap;
import java.util.Map;

public class EncodeString {
	public static void main(String[] args) {
		String frase = "Eu quero ir";
		Map<Character, Integer> alfabeto = new HashMap();

		alfabeto.put('a', 1);
		alfabeto.put('b', 2);
		alfabeto.put('c', 3);
		alfabeto.put('d', 4);
		alfabeto.put('e', 5);
		alfabeto.put('f', 6);
		alfabeto.put('g', 7);
		alfabeto.put('h', 8);
		alfabeto.put('i', 9);
		alfabeto.put('j', 10);
		alfabeto.put('k', 11);
		alfabeto.put('l', 12);
		alfabeto.put('m', 13);
		alfabeto.put('n', 14);
		alfabeto.put('o', 15);
		alfabeto.put('p', 16);
		alfabeto.put('q', 17);
		alfabeto.put('r', 18);
		alfabeto.put('s', 19);
		alfabeto.put('t', 20);
		alfabeto.put('u', 21);
		alfabeto.put('v', 22);
		alfabeto.put('w', 23);
		alfabeto.put('x', 24);
		alfabeto.put('y', 25);
		alfabeto.put('z', 26);
		String saida = "";
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			if (alfabeto.containsKey(frase.charAt(i))) {
				saida += alfabeto.get(frase.charAt(i)) + " ";
			}
		}

		System.out.println(saida.trim());

	}
}
