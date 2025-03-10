import java.util.Scanner;

public class 문제5_3_다시 {
  public static void main(String[] args) {
    int a1, b1;
    String c;
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 수 : ");
    a1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    b1 = sc.nextInt();
    System.out.print("연산자 : ");
    c = sc.next();

    if(c.equals("+")){
      System.out.println(a1 + " + " + b1 + " = " + (a1 + b1));
    } else if (c.equals("-")) {
      System.out.println(a1 + " - " + b1 + " = " + (a1 - b1));
    } else if (c.equals("*")) {
      System.out.println(a1 + " * " + b1 + " = " + (a1 * b1));
    } else if (c.equals("/")) {
      System.out.println(a1 + " / " + b1 + " = " + (a1 / b1));
    } else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }


  }
}
