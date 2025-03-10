package practice;

public class 메소드08_5_쌤이랑 {
  public static void main(String[] args) {
    test11(3, 7);
  }
  
// 11. 두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고,
// 한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를, 두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를
// 출력하는 메소드를 선언하고 호출해보세요.
  public static void test11(int a, int b){
    if(a % 2 == 0 && b % 2 == 0){
      System.out.println("짝수");
    } else if (a % 2 == 1 && b % 2 == 1) {
      System.out.println("홀수");
    } else {
      System.out.println("하나만 짝수");
    }
  }
  
  
}
