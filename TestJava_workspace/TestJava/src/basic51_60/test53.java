
package basic51_60;

import java.util.Scanner;

// 1053 : [기초-논리연산] 참 거짓 바꾸기(설명)
public class test53 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();// 자원아끼기

		if(num == 1)
			System.out.println(0);
		else
			System.out.println(1);
	}
}
