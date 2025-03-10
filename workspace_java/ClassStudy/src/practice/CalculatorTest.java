package practice;

import java.util.Scanner;

public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    int num2 = sc.nextInt();
    System.out.print("연산자 : ");
    String oper = sc.next();

//    계산기 객체 생성
    Calculator cal = new Calculator(num1, num2); // 2. 키보드로 입력받은 수를 초기값으로 전달
    //cal.setA(num1); // 1. setter를 사용해서 변경하는 방식
    //cal.setB(num2);

    switch (oper){
      case "+" : //10 + 20 = 30
        System.out.println(num1 + oper + num2 + "=" + cal.getSum());
        break;
      case "-" :
        System.out.println(num1 + oper + num2 + "=" + cal.getSub());
        break;
      case "*" :
        System.out.println(num1 + oper + num2 + "=" + cal.getMulti());
        break;
      case "/" :
        System.out.println(num1 + oper + num2 + "=" + cal.getDiv());
        break;
      default :
        System.out.println("연산자를 잘못 입력했습니다.");
    }



  }
}
