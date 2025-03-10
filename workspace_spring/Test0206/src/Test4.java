import java.util.Scanner;

 public class Test4 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int num;
      System.out.println("1~99 사이의 정수를 입력하시라요");
      num = sc.nextInt();
      int clapCnt = 0;

      int tens = num / 10;

      int ones = num % 10;

      if (tens == 3 || tens == 6 || tens == 9){
        ++clapCnt;

      }
      if (ones == 3 || ones == 6 || ones == 9){
        //만약 일의 자리 수가 3,6,9면 박수 수를 1증가
        ++clapCnt;
      }

      switch (clapCnt){
        case 0:
          System.out.println("박수없음");
          break;
        case 1:
          System.out.println("박수 짝");
          break;
        case 2:
          System.out.println("박수 짝짝");

      }
    }
  }