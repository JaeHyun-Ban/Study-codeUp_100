package basic41_50;

import java.util.Scanner;

// 1047 : [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기(설명)
public class test47 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();
		
		System.out.println(num*2);//바로 생각난 것
		System.out.printf("%d", num << 1);
		// C언어, 비트를 통째로 1칸 이동시켜 값을 얻어내는 답안
		// 이동방향은 << 왼쪽, >> 오른쪽 이다
	}
}
