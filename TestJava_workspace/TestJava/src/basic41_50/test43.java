package basic41_50;

import java.util.Scanner;

// 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력하기(설명)
public class test43 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1%num2);
		
	}
}
