package Basic21_30;

import java.util.Scanner;

// 1022 : [기초-입출력] 문장 1개 입력받아 그대로 출력하기(설명)
// 공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자.

public class test22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // nextLine()는 엔터 이전의 "공백을 포함한 문자열"을 받아준다
    String str = sc.nextLine();

    System.out.println(str);
  }
}