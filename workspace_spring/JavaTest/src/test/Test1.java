package test;

import java.util.Scanner;

// 1. 세 정수를 Scanner로 입력받아 큰 수부터 나열하여 출력하는 프로그램을 작성하시오.
// 단 입력받는 세 수는 중복값이 없다고 가정한다. (클래스명 : Test1.java
public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;

    System.out.print("첫 번 째 숫 자 : ");
    num1 = sc.nextInt();
    System.out.print("두 번 ㅈㅈㅐ 숫 자 : ");
    num2 = sc.nextInt();
    System.out.print("ㅁr ㅈ1 막 숫 자 : ");
    num3 = sc.nextInt();

    int max = 0;
    int mid = 0;
    int min = 0;
    if(num1 > num2 && num1 > num3){
      max = num1;
      if(num2 > num3){
        mid = num2;
        min = num3;
      }
      else{
        mid = num3;
        min = num2;
      }
    }
    else if(num2 > num1 && num2 > num3){
      max = num2;
      if(num1 > num3){
        mid = num1;
        min = num3;
      }
      else{
        mid = num3;
        min = num1;
      }
    }
    else{
      max = num3;
      if(num1 > num2){
        mid = num1;
        min = num2;
      }
      else{
        mid = num2;
        min = num1;
      }
    }
    System.out.println("큰수부터,,,  " + max + ", " + mid + ", " + min + ",,,");
    System.out.println("중복값제거는 죄송합니다..");

  }
}
