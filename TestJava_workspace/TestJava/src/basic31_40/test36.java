package basic31_40;

import java.util.Scanner;

// 1036 : [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기(설명)
public class test36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char c= sc.nextLine().charAt(0);
		//1개입력받아 -> charAt(0)
		sc.close();
		
		int num = (int)c;//10진수 변경
		
		System.out.println(num);
		

	}
}
