package practice;

public class 메소드08_8_쌤이랑 {
  public static void main(String[] args) {
    test14(5,20);
  }
//14. 두 정수를 매개변수로 받아,
//    두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고 호출해보세요.
    public static void test14(int a, int b){
    int max = a > b ? a : b ;
    int min = a < b ? a : b ;
    int cnt = 0;

    for(int i = min + 1 ; i < max ; i++){
      if(1 % 5 == 0){
        cnt++;
      }
    }
      System.out.println(cnt);

    }
}
