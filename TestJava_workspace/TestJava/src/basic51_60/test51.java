package basic51_60;

import java.util.Scanner;

// 1051 : [기초-비교연산] 두 정수 입력받아 비교하기3(설명)
public class test51 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if(num1 <= num2) // 크거나 같다면
			System.out.println(1);
		else //그렇지 않다면
			System.out.println(0);
	}
}
