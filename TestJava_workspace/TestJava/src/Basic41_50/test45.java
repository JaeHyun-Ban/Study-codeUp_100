package Basic41_50;

import java.util.Scanner;

// 1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기
public class test45 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		System.out.printf("%.2f", (float)num1/num2);

	}
}
