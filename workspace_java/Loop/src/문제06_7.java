public class 문제06_7 {
  public static void main(String[] args) {
//    1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고,
//    5의 배수인 수의 개수도 출력해 보세요
    int i = 1;
    int cnt = 0;
    while (i < 101){
      if(i % 5 == 0){
        cnt++;
        System.out.print(i + " ");
      }
      i++;
    }
    System.out.println();
    System.out.println("5의 배수의 개수 : " + cnt);

  }
}
