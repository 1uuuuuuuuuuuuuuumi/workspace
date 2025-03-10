package practice;

import java.util.Scanner;

public class 메소드09_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//1번 호출
//    int sum = test1(10, 11);
//    System.out.println(sum);

//2번 호출
//    System.out.println("첫뻔째정수 : ");
//    int num1 = sc.nextInt();
//    System.out.println("두번쨰쩡수 : ");
//    int num2 = sc.nextInt();
//    System.out.println(num1 * num2);

//3번 호출
//    int max = test3(3, 76);
//    System.out.println(max);

//4번 호출
//    String str = test4("으", "악");
//    System.out.println(str);

//5번 호출
//    int score = test5(90);
//    System.out.println(score);

//6번 호출
//    String str = test6(35);
//    System.out.println(str);


//7번 호출
//    double a = test7(3.7);
//    System.out.println(a);

//8번 호출
//    int num = test8(100, 100, 100);
//    System.out.println(num);

//9번 호출
int sum = test9(9);
    System.out.println(sum);



  }

//9. 한 정수를 매개변수로 받아,
//1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.
  public static int test9(int num){
    int sum = 0;
    for(int i = 1; i <= num; i++){
      if(i % 2 == 1){
        sum = sum + i;}
    }
    return sum;
  }



//8. 세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
  public static int test8(int num1, int num2, int num3){
    return (num1 + num2 + num3) / 3;
  }



//7. 실수를 매개변수로 받아, 그 수의 제곱 값을 리턴하는 메소드를 만들고 사용해보세요.
  public static double test7(double a){
    return a * a;
  }



//6. 매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
//  public static String test6(int num){
//    return num + "";
//  }





//5. 임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 ‘A’,
//70 이상이면 ‘B’, 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요.
//  public static int test5(int score){
//    if(score >= 90){
//      return ;
//    } else if (score >= 70) {
//      return ;
//    } else {
//      return ;
//    }
//  }



//4. 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요.
  public static String test4(String str1, String str2){
    return str1 + str2;
  }



//3. 두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
  public static int test3(int num1, int num2){
    if(num1 > num2){
      return num1;
    } else {
      return num2;
    }
  }


  //2. scanner로 입력받은 두 정수를 매개변수로 받아,
//두 정수의 곱을 리턴하는 메소드를 선언하고 호출하여 결과를 호학인해보세요.
  public static int test2(int num1, int num2){
    return num1 * num2;
  }


//1. 두 정수를 매개변수로 받아, 두 정수의 합을 리턴하는 메소드를 선언하고 호출하여 결과를 확인하세요.
  public static int test1(int a, int b){
    return a + b;
  }






}
