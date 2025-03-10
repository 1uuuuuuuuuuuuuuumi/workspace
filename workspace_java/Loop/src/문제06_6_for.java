public class 문제06_6_for {
  public static void main(String[] args) {
//    int a = 0;
//    for(int i = 1; i<100; i++){
//      if(i % 3 == 0){
//        a++;
//      }
//    }
//    System.out.println(a);


//    1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
    int cnt = 0;

    for(int i = 1; i < 101; i++){
      if(i % 3 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);

  }
}
