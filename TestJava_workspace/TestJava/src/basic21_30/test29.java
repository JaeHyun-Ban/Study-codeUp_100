package basic21_30;

import java.util.Scanner;

//1029 : [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2(설명)
public class test29 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double d = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("%.11f\n", d);
		
		
	}
}
