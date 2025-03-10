public class 문제06_5 {
  public static void main(String[] args) {
    int a = 1;
    int b = 0;
    while(a<11){
      b = a + b;
      a++;
    }
    System.out.println(b);
  }
}
