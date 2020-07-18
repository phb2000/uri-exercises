package app;

import java.util.Scanner;

public class Uri1188 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] array = new double[12][12];
		Scanner sc = new Scanner(System.in);
		double number;
		double total = 0.0;
		String op = sc.next();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				number = sc.nextDouble();
				array[i][j] = number;
			}
		}

		for (int i = 11; i > 6; i--) {
			for (int j = array.length - i; j <= i - 1; j++) {
				total += array[i][j];
			}
		}

		System.out.printf("%.1f%n", (op.equalsIgnoreCase("s") ? total : total / 30));
		sc.close();
	}

}
