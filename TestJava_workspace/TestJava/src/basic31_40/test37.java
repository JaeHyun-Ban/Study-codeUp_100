package basic31_40;

import java.util.Scanner;

// 1037 : [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
public class test37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();//정수 입력받기
		sc.close();
		
		char c = (char) num;//
		
		System.out.println(c);

	}
}
