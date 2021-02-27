package Basic11_20;

import java.util.Arrays;
import java.util.Scanner;

public class test18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		String year = sc.next(); //String으로 입력받기
		String[] list = year.split("\\."); //split으로 나눠주기
		
		//월, 일의 string길이가 1이다 => 한자리다 => 앞에 0을 붙여준다
		if(list[1].length() == 1 || list[2].length() == 2) {
			
		}
			
		
		System.out.println(year);
		System.out.println(Arrays.toString(list));
		
	}
}
