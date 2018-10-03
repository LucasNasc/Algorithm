package Desafios;

public class Fibonacci {

	public static void main(String[] args) {
		int proximo = 0;
		int atual = 0;
		int anterior = 1;
		while (proximo <= 100) {

			proximo = atual + anterior;
			System.out.println(proximo + ",");
			anterior = atual;
			atual = proximo;
		}
	}
}
