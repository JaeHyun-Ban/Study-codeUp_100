package basic31_40;

import java.util.Scanner;

// 1031 : [기초-출력변환] 10진 정수 1개 입력받아 8진수로 출력하기(설명)
public class test31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		String oct = Integer.toOctalString(num);//8진수 Oct으로 변경
		
		System.out.println(oct);
		
	}
}
