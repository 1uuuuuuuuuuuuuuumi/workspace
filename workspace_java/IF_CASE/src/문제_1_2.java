import java.util.Scanner;

public class 문제_1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1;
    System.out.println("정수입력 : ");
    num1 = sc.nextInt();

    if(num1 % 2 ==0){
      System.out.println("짝수입니다.");
    }
    if(num1 % 2 != 0){
      System.out.println("홀수입니다.");
    }

  }
}
