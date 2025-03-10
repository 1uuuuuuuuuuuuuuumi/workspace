package practice;

import java.util.Scanner;

public class 메소드08_3_사실상9번문제 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번ㅉㅐ 정수 : ");
    int num1 = sc.nextInt();
    System.out.print("두번ㅈㅈㅐ 정수 : ");
    int num2 = sc.nextInt();
    test9(num1, num2);
  }

//   9. scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여
//   두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
  public static void test9(int num1, int num2){
    System.out.println(num1 + num2);
  }

}
