package Basic41_50;

import java.util.Scanner;

// 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
public class test46 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		long num3 = sc.nextLong();
		sc.close();
		
		long sum = num1 + num2 + num3;
		float avg = (float) sum / 3;
		
		System.out.println(sum);
		System.out.printf("%.1f", avg);
		

	}
}
