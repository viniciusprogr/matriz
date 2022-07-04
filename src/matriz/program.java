package matriz;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("numero:");

		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);

                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i - 1][j]);

                    }
                    if (j < m - 1) {
                        System.out.println("Esquerda: " + mat[i][j + 1]);

                    }
                    if (i < n - 1) {
                        System.out.println("Baixo: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    



	}

}
