import java.util.Scanner;

public class 문제_1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    int min; //num1과 num2 중 작은 수를 저장할 변수
    int max; //num1과 num2 중 큰 수를 저장할 변수

    System.out.println("첫번째 수 : ");
    num1 = sc.nextInt();

    System.out.println("두번째 수 : ");
    num2 = sc.nextInt();

//    num1의 값이 num2의 값보다 크다면...
    if(num1 > num2){
      min = num2;
      max = num1;
    }
    else{ //num2 > num1, num1 == num2
      min = num1;
      max = num2;
    }
    System.out.println(max + " > " + min);

  }
}
