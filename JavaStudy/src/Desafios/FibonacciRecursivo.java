package Desafios;

public class FibonacciRecursivo {
	public static void main(String[] args) {

		for (int u = 0; u < 100; u++) {
			System.out.println(fibo(u));
		}
	}

	private static int fibo(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return (fibo(x - 1) + fibo(x - 2));
		}

	}
}
