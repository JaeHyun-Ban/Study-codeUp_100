package Basic41_50;

import java.util.Scanner;

// 1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기(설명)
public class test41 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0); //문자 1개 입력받기
		sc.close();
		
		System.out.println((char)((int)c + 1));//10진수로 변환 + 1 후 다시 문자(아스키)로 변환
		
		// C언어 문법 - 더 편할지도..?
		// System.out.printf("%c", c + 1);
		
	}
}
