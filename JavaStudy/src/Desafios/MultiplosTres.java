package Desafios;

public class MultiplosTres {

	// multiplos de 3
	private static int multiplosde3(int j ) {
		int u = 0;
		for (int i = 0; i <= j; i++) {

			if (i % 3 == 0) {
				System.out.println(i);
			}
			
			u = i;
		}
		return u;
	}
	
	public static void main(String[] args) {
		multiplosde3(100);
	}
}
