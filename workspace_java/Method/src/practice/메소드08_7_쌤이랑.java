package practice;

public class 메소드08_7_쌤이랑 {
  public static void main(String[] args) {
    int a = 5;
    int b = 15;
    test13(a, b);
  }
//13. 두 정수를 매개변수로 받아,
//    두 정수 사이의 숫자를 출력하는 메소드를 선언 및 호출해보세요.
  public static void test13(int first, int second){
//  두 수 중 큰 수, 작은 수를 구분
    int max = first > second ? first : second;
    int min = first < second ? first : second;

    for(int i = min + 1; i < max; i++){
      System.out.print(i + " ");
    }
  }
}
