package app;

import java.util.Scanner;

public class Uri1435 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int x = 1;

		while (size > 0) {
			int[][] array = new int[size][size];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; array[i].length > j; j++) {
					x = i + 1;
					if(j < x) {
						x = j + 1;
					}
					if(size - j < x) {
						x = size - j ;
					}
					if(size - i < x) {
						x = size - i ;
					}
					

					array[i][j] = x;
				}
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; array[i].length > j; j++) {
					System.out.printf("%s%d", j == 0 ? "  " : "   ", array[i][j]);
				}
				System.out.println();
			}

			size = sc.nextInt();
		}

		sc.close();

	}

}
