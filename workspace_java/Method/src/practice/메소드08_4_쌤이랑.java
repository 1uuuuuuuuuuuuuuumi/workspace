package practice;

//  10. 한 정수를 매개변수로 받아,
//  그 정수가 짝수이면 ‘짝수입니다’,
//  홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요.
public class 메소드08_4_쌤이랑 {
  public static void main(String[] args) {
//  test10() 메서드의 인자로 5가 전달되었다.
//  -> *인자 : 실제 메서드로 호출할때 매개변수를 전달할때 부름  *매개변수 : 정의할때 사용
    test10(17);
 }

 public static void test10(int a){
   System.out.println( a % 2 == 0 ? "짝수입니다" : "홀수입니다" );
 }

}
