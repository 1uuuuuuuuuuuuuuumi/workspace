public class 문제06_3_for {
  public static void main(String[] args) {
//    for(int a = 2; a < 11; a=a+2){
//      System.out.println(a);
//    }

//  첫번째 방법
    for(int i =2; i < 11; i = i+ 2){
      System.out.println(i);
    }
    System.out.println();

//    두번째 방법
    for(int i = 2; i < 11; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }


  }
}
