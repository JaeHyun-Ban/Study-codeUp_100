package basic21_30;

import java.util.Scanner;

//1026 : [기초-입출력] 시분초 입력받아 분만 출력하기(설명)
public class test26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String time = sc.nextLine();
		
		String[] times = time.split(":");
		int hour = Integer.parseInt(times[0]);
		int min = Integer.parseInt(times[1]);
		int sec = Integer.parseInt(times[2]);
		
		System.out.println(min);
		sc.close();

	}
}
