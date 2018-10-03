package Desafios;

public class Fatorial {
	// fatorial

	private static Long FazFatorial(long fat) {
		for (int n = 1; n <= 10; n++) {
			fat = fat * n;
			System.out.println("O fatorial de " + n + " é : " + fat);
		}
		return fat;
	}

	public static void main(String[] args) {
		FazFatorial(1);
	}
}