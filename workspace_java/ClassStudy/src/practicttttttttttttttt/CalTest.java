package practicttttttttttttttt;

import java.util.Scanner;

public class CalTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 수 : ");
    int num1 = sc.nextInt();
    System.out.println("두번째 수 : ");
    int num2 = sc.nextInt();
    System.out.println("연산자 : "); // +
    String  oper = sc.next();

    switch (oper){
      case "+":
        Add add = new Add();
        add.setValue(num1, num2);
        add.calculate();
        // 10 + 20 = 30
        System.out.println(num1 + oper + num2 + "=" + add.calculate());
        break;
      case "-":
        Sub sub = new Sub();
        sub.setValue(num1, num2);
        System.out.println(num1 + oper + num2 + "=" + sub.calculate());
        break;
      case "*":
        break;
      case "/":
        break;
      default:
        System.out.println("연산자를 잘못 입력했습니다.");
    }

  }
}
