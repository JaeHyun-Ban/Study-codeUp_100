package basic11_20;

import java.util.Scanner;

public class test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String str1[] = str.split("-");//문자열을 "-"으로 나눠 배열로 저장
		System.out.println(str1[0] + str1[1]);
	}
}
