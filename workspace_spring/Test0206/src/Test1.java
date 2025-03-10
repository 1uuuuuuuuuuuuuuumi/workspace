import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;

    System.out.print("정 수 입 력 하 라 ! ");
    num1 = sc.nextInt();
    System.out.print("두 번 ㅈㅈㅐ 정 수 입 력 햇 !! ");
    num2 = sc.nextInt();
    System.out.print("ㅁr ㅈ1 막 정 수 입 력 !!! ");
    num3 = sc.nextInt();

    int max = 0;
    int mid = 0;
    int min = 0;
    if(num1 > num2 && num1 > num3){
      max = num1;
      if(num2 > num3){
        mid = num2;
        min = num3;
      }
      else{
        mid = num3;
        min = num2;
      }
    }
    else if(num2 > num1 && num2 > num3){
      max = num2;
      if(num1 > num3){
        mid = num1;
        min = num3;
      }
      else{
        mid = num3;
        min = num1;
      }
    }
    else{
      max = num3;
      if(num1 > num2){
        mid = num1;
        min = num2;
      }
      else{
        mid = num2;
        min = num1;
      }
    }
    System.out.println("큰수부터,,, + " + max + ", " + mid + ", " + min + ",,,");

  }
}
