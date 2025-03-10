import java.util.Scanner;

public class 문제5_3 {
  public static void main(String[] args) {
    int num1, num2; //두 정수를 저장할 변수
    String oper; //연산자를 저장할 변수
    Scanner sc = new Scanner(System.in);

//    정보 입력
    System.out.print("첫 번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    num2 = sc.nextInt();
    System.out.print("연산자 : ");
    oper = sc.next();

    if(oper.equals("+")){
      //num1 : 3, num2 : 5, oper : +
      // => 3+5 = 8
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 + num2));
    }
    else if (oper.equals("-")) {
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 - num2));
    }
    else if(oper.equals("*")){
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 * num2));
    }
    else if(oper.equals("/")){
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 / (double)num2));
    }
    else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }


  }
}
