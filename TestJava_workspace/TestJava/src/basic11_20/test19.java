package basic11_20;

import java.util.Scanner;

public class test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    String str = sc.next();
	    
		String array[] = str.split("\\.");// \\.로 나누기
		int year = Integer.parseInt(array[0]);// int로 변환 후 대입
		int month = Integer.parseInt(array[1]);
		int day = Integer.parseInt(array[2]);

		System.out.printf("%04d.%02d.%02d", year, month, day);// %02d사용시 2칸 기본 출력, 한자리 수인경우 0을 붙여준다
	}
}
