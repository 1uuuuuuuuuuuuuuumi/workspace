import java.util.Scanner;

public class 심화문제_1_2 {
  public static void main(String[] args) {

    int xPos, yPos;
    Scanner sc = new Scanner(System.in);
    System.out.println("점 (x, y)의 좌표를 입력하세요 >>> ");
    xPos = sc.nextInt();
    yPos = sc.nextInt();

    if(xPos >= 50 && xPos <= 100 && yPos >= 50 && yPos <= 100){
      System.out.println("사각형안에 점 이 있 다 ! ! ! ! !");
    }





  }
}
