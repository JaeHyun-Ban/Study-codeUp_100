package basic11_20;

import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char x = sc.next().trim().charAt(0);
		char y = sc.next().trim().charAt(0);
		System.out.printf("%c %c", y, x);

		System.out.println();
		sc.close();

	}
}
