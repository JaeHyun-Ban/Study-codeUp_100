package basic51_60;

import java.util.Scanner;

// 1054 : [기초-논리연산] 둘 다 참일 경우만 참 출력하기(설명)
public class test54 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();// 자원아끼기

		if (num1 == 1 && num2 == 1) // 둘 다 참일 시
			System.out.println(1);
		else
			System.out.println(0);
	}
}
