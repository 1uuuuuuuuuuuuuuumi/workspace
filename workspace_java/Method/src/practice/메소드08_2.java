package practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class 메소드08_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력 : ");
    int num = sc.nextInt();
    test8(num);
  }

//   8. 키보드로 입력받은 정수를 매수변수로 받아, 해당 정수를 출력하는 메소드를 선언, 호출해보세요.
  public static void test8(int num){
    System.out.println(num);
  }
}
