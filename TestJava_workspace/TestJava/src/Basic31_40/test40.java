package Basic31_40;

import java.util.Scanner;

// 1040 : [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기(설명)

public class test40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();
		sc.close();
		System.out.printf("%d", -num);
		// C언어의 negative연산자를 이용해 해결
		// `-`변수 앞에 붙이면 부호가 반대로 바뀌게 된다.

	}
}
