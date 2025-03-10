package test;

import java.util.Scanner;

// 3. 1 ~ 999까지의 수 중 임의의 숫자를 Scanner를 통해 입력 받아,
// 입력받은 숫자의 369게임 결과를 출력하는 프로그램을 만드시오.
// 만약 박수가 없는 숫자라면 ‘박수 0번’, 박수 한 번이라면 ‘박수 1번’,
// 박수 두 번이라면 ‘박수 2번’, 박수가 3번이면 ‘박수 3번’이라는 문자열을 출력하면 된다.
// 단, 키보드로 숫자를 입력받을 때 1 ~ 999까지 숫자 이외의 데이터는 입력받지 않는다고 가정한다.
public class Test3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number;
    int first=0, second=0, third=0;
    int cnt=0;

    System.out.print("1~999사이의 숫자를 입력하세요 : ");
    number = scan.nextInt();

    if(number<0 || number>999) {
      System.out.print("다시 입력해주세요 : ");
      number = scan.nextInt();
    }

    first = number/100;
    second = (number%100)/10;
    third = (number%100)%10;

    if(first==0) {
      first=1;
    }
    if(second==0) {
      second=1;
    }
    if(third==0) {
      third=1;
    }

    if(first%3==0)
      cnt++;
    if(second%3==0)
      cnt++;
    if(third%3==0)
      cnt++;
    else {
      System.out.println("박수 0번");
    }

    if(cnt==3)
      System.out.println("박수 3번");
    if(cnt==2)
      System.out.println("박수 2번");
    if(cnt==1)
      System.out.println("박수 1번");

  }
}