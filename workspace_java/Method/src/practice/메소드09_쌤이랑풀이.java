package practice;

public class 메소드09_쌤이랑풀이 {
  public static void main(String[] args) {

//3번 호출
//    test3(10, 20);

//5번 호출 ;;?

//6번 호출

//7번 호출

//8번 호출
//    double a = 10;

//10번 문제
//    boolean a = true  >>> boolean은 문자열이 아님

  }

//10. 매개변수로 문자열 데이터 하나를 받아, 해당 문자열의 길이가 짝수 일 때는 true를 리턴하고,
//홀수 일 때는 false를 리턴하는 메서드를 선언하고 사용해보세요
  public static boolean test10(String a){

    //삼항연산자
//    return a.length() % 2 == 0 ? true : false;

    //더 줄인 버전
    return a.length() % 2 == 0;

//    if(a.length() % 2 == 0 ){
//      return true;
//    } else {
//      return false;
//    }
  }



//9. 한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.
  public static int test9(int num){
    int sum = 0;
    for(int i = 1 ; i < num + 1 ; i++){
      if(i % 2 == 1){
        sum = sum + i;
      }
    }
    return sum;
  }


//8. 세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
  public static double test8(int a, int b, int c){
    return (a + b + c) / 3.0;
  }



// 7. 실수를 매개변수로 받아, 그 수의 제곱 값을 리턴하는 메소드를 만들고 사용해보세요.
  public static double test7(double d){
    return d * d;
  }



//6. 매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
  public static String test6(int num){
// 숫자 -> 문자열
    String a = String.valueOf(10);

    // 문자열 -> 정수
    int b = Integer.parseInt("10");


    return String.valueOf(num);
//    return num + "";  이거 하나만 해도됨
  }


//5. 임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 ‘A’,
//70 이상이면 ‘B’, 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요.
  public static String test5(int num){
    if(num >= 90){
      return "A";
    } else if (num >= 70){
      return "B";
    } else {
      return "C";
    }
  }


//3. 두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
  public static int test3(int a, int b){
    return a > b ? a : b;
  }

}
