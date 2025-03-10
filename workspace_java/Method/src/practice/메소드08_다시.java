package practice;

import javax.sound.midi.Soundbank;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.Scanner;

public class 메소드08_다시 {
  public static void main(String[] args) {
//1번 문제 호출
//    test1("메롱");

//2번 문제 호출
//    test2(3);

//3번 문제 호출
//    test3("메에에에에롱");

//4번 문제 호출
//    test4(3, 4);

//5번 문제 호출
//    test5(2, 3, 5);

//6번 문제 호출
//    test6(3, 9);

//7번 문제 호출
//    test7("모", "야");

//8번 문제 호출
//    Scanner sc = new Scanner(System.in);
//    System.out.print("정수입력좀여~~~ : ");
//    int num = sc.nextInt();
//    test8(num);

//9번 문제 호출
//    Scanner sc = new Scanner(System.in);
//    System.out.print("첫뻔째쩡쑤 : ");
//    int num1 = sc.nextInt();
//    System.out.print("두번쨰쩡수 : ");
//    int num2 = sc.nextInt();
//    test9(num1, num2);

//10번 문제 호출
//    test10(4);

//11번 문제 호출
//test11(3, 6);


  }
//12. 한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언 및 호출해보세요.
public static void test12(int num){

}


//11. 두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고,
//한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를,
//두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를 출력하는 메소드를 선언하고 호출해보세요.
  public static void test11(int num1, int num2){
    if(num1 % 2 == 0 && num2 % 2 == 0){
      System.out.println("짝쑤입ㄴ1다");
    } else if(num1 % 2 == 0 || num2 % 2 == 0){
      System.out.println("한 수만 짞쑤입니닷");
    } else {
      System.out.println("홀 쑤 입 ㅁ1 ㄷ ㅏ");
    }
  }


//10. 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’,
// 홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요.
  public static void test10(int num){
    if(num % 2 == 0){
      System.out.println("짝 쑤 입 ㄴ1 ㄷ ㅏ ! ");
    } else {
      System.out.println("훨 쑤 입 ㄴㅔ 다 !!!!!");
    }
  }


//9. scanner로 정수 두 개를 입력받아,
//입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
  public static void test9(int num1, int num2){
    System.out.println(" ㄷㅓ하면 2ㄱㅓ닷 -> " + (num1 + num2));
  }




//8. 키보드로 입력받은 정수를 매수변수로 받아, 해당 정수를 출력하는 메소드를 선언, 호출해보세요.
  public static void test8(int num){
    System.out.print("짠 ! " + num);
  }


//7. 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요
  public static void test7(String str1, String str2){
    System.out.print(str1);
    System.out.print(str2);
  }


//6. 두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요.
  public static void test6(int num1, int num2){
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);
  }


// 5. 정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test5(int num1, int num2, int num3){
    System.out.println(num1 * num2 * num3);
  }


// 4. 정수 두 개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출해 보세요.
  public static void test4(int num1, int num2){
    System.out.println(num1 + num2);
  }


// 3. 문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출해보세요.
  public static void test3(String str){
    System.out.println(str);
  }


// 2. 정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하여 보세요.
  public static void test2(int num){
    System.out.println(num);
  }


//1. ‘안녕하세요’ 라는 문자열를 출력하는 기능을 가진 메소드를 선언하고, 호출해 보세요.
  public static void test1(String str){
    System.out.println(str);
  }


}
