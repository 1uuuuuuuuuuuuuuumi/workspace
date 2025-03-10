package practice;

import java.util.Scanner;

public class 메소드08_6_쌤이랑 {
  public static void main(String[] args) {
    test12(3);
  }

//   12. 한 정수를 매개변수로 받아,
//   0부터 입력받은 숫자까지 출력하는 메소드를 선언 및 호출해보세요.
  public static void test12(int num){
    for(int i = 0 ; i <= num ; i++){
      System.out.print(i + " ");
    }
  }

}
