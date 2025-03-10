package practice;

import java.util.Scanner;

public class 메소드08_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    1번 문제 호출
//    test1();

//    2번 문제 호출
//    test2(5);

//    3번 문제 호출
//    test3("메롱");

//    4번 문제 호출
//    test4(73,17);

//    5번 문제 호출
//    test5(3, 2, 3);

//    6번 문제 호출
//    test6(3, 9);

//    7번 문제 호출
//    test7("모", "야");
  }



//  7. 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요.
  public static void test7(String msg1, String msg2){
    System.out.print(msg1);
    System.out.print(msg2);
  }


//  6. 두 정수를 매개변수로 받아,
//  두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test6(int num1, int num2){
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);
  }



//  5. 정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test5(int num1, int num2, int num3){
    System.out.println(num1 * num2 * num3);
  }



//  4. 정수 두 개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test4(int num1, int num2){
    System.out.println(num1 + num2);
  }


//  3. 문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출해보세요.
  public static void test3(String message){
    System.out.println(message);
  }


//  2. 정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하여 보세요.
  public static void test2(int num){
    System.out.println(num);
  }


//  1. ‘안녕하세요’ 라는 문자열를 출력하는 기능을 가진 메소드를 선언하고, 호출해 보세요.
  public static void test1(){
    System.out.println("안녕하세요");
  }



}
