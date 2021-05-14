package Basic21_39;

import java.util.Scanner;

// 1024 : [기초-입출력] 단어 1개 입력받아 나누어 출력하기(설명)
// 단어를 1개 입력받는다.
// 입력받은 단어(영어)의 각 문자를
// 한줄에 한 문자씩 분리해 출력한다.
public class test24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    char[] c = str.toCharArray();
    for (char x : c) {
      System.out.println("'" + x + "'");
    }

    // 1. String으로 문자열 받기
    // 2. toCharArray()를 통해 char배열로 변환
    // - String은 char[]이다
    // 3. 향상 for문으로 출력
  }

}
