package Basic21_39;

import java.util.Arrays;
import java.util.Scanner;

// 1023 : [기초-입출력] 실수 1개 입력받아 부분별로 출력하기(설명)
// 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

public class test23 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    String str1[] = str.split("\\.");// .을 기준으로 분리

    System.out.println(str1[0]);
    System.out.println(str1[1]);
  }
}
