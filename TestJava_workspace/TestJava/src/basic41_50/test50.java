package basic41_50;

import java.util.Scanner;

// 1050 : [기초-비교연산] 두 정수 입력받아 비교하기2(설명)
public class test50 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if(num1 == num2) // 같다면
			System.out.println(1);
		else //같지 않다면
			System.out.println(0);
	}
}
