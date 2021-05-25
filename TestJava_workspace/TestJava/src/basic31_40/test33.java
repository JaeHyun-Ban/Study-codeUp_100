package basic31_40;

import java.util.Scanner;

// 1033 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기2(설명)
public class test33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		String hex = Integer.toHexString(num);//16진수 Hex으로 변경
		
		
		System.out.println(hex.toUpperCase());//change to upperCase 
		
	}
}
