package practice;

public class 배열문제07_5 {
  public static void main(String[] args) {

/*
5. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소의 값을 출력해보아라.

int[] arr1 = new int[10];
for(int i = 0; i < 10; i++){
  System.out.println(arr1[i])}
}
*/


//    [답]
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}