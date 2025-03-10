import java.util.Scanner;

public class 문제_1_3 {
  public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수 입력 : ");
    a = sc.nextInt();

    System.out.println("두번째 정수 입력 : ");
    b = sc.nextInt();

    if(a>b){
      System.out.println("a가 큽니다.");
    }
    if(a<b){
      System.out.println("b가 큽니다.");
    }

  }
}
