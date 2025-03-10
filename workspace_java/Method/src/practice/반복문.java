package practice;

import java.util.Scanner;

public class 반복문 {
  public static void main(String[] args) {
////1. System.out.print(“*”);을 사용하여 별을 다섯 개 출력해보자. 단 출력문은 한번만 사용해야 한다.
//
//    for(int i = 1; i <= 5; i++){
//      System.out.println("*");
//    }









////2. 출력문을 한번만 사용하여 0 ~ 5까지 출력해 보세요.
//    for(int i = 0; i <=5; i++){
//      System.out.println(i);
//    }









//// 3. 출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력해 보세요.
//    for(int i = 2; i <= 10; i++){
//      if(i % 2 == 0){
//        System.out.println(i);
//      }
//    }









////4. 출력문을 한번만 사용하여 10 ~ 0 까지 출력해 보세요.
//    for(int i = 10; i >= 0; i--){
//      System.out.println(i);
//    }









////5. 반복문을 사용하여 1 ~ 10까지의 합을 구하세요.
//    int sum = 0;
//    for(int i = 0; i <= 10; i++){
//      sum = sum + i;
//    }
//    System.out.println(sum);









////6. 1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
//    int a = 0;
//    for(int i = 1; i <= 100; i++){
//      if(i % 3 == 0){
//        a++;
//      }
//    }
//    System.out.println(a);









//7. 1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해보세요.
//    int a = 0;
//    for(int i = 1; i <= 100; i++){
//      if(i % 5 == 0){
//        a++;
//        System.out.println(i);
//      }
//    }
//    System.out.println("개수 : " + a);











//8. 키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.
//    Scanner sc = new Scanner(System.in);
//    int num;
//    int a = 0;
//    System.out.print("정 수 입 력 : ");
//    num = sc.nextInt();
//
//    for(int i = 1; i <= num; i++){
//      if(i % 2 == 0){
//        a++;
//      }
//    }
//    System.out.println("짝수의 개수 : " + a);









//9. 다음 프로그램의 실행 결과를 예측해보세요.
     // -> 100









//10.다음 프로그램의 실행 결과를 예측해보세요.
    // ->
    int i = 0, k = 0;
    for(i = 1; i < 100; i++){
      k += i;
      if(k>100)
        break;
    }
    System.out.println(i);



  }
}
