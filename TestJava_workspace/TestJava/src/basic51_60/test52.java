
package basic51_60;

import java.util.Scanner;

// 1052 : [기초-비교연산] 두 정수 입력받아 비교하기4(설명)
public class test52 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if(num1 != num2) // !=: 서로 다를시
			System.out.println(1);
		else //그렇지 않다면
			System.out.println(0);
	}
}
