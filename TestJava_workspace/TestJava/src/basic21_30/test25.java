package basic21_30;

import java.util.Scanner;

//1025 : [기초-입출력] 정수 1개 입력받아 나누어 출력하기(설명)
public class test25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		
		System.out.println("[" + c[0] + "0000]");
		System.out.println("[" + c[1] + "000]");
		System.out.println("[" + c[2] + "00]");
		System.out.println("[" + c[3] + "0]");
		System.out.println("[" + c[4] + "]");
		
	}
}
