package basic41_50;

import java.util.Scanner;

// 1048 : [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기(설명)
public class test48 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		// Java - Math.pow를 이용
		System.out.println(num1 * (int) Math.pow(2, num2));

		// C언어
//		System.out.printf("%d", num1 << num2);
	}
}
