package practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class 배열문제07_9 {
  public static void main(String[] args) {
//    9. 수를 5개 저장할 수 있는 배열을 만들고,
//    scanner를 통해 입력받은 값을 하나씩 배열의 요소에 저장해보자.
//    만약 키보드로 1 2 3 4 5를 입력했다면
//    배열의 요소에 각각 1 2 3 4 5 가 저장 되어야 한다
//    출력을 통해 결과를 확인해 보아라.

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

//    arr배열의 0번째 요소에 키보드로 값 입력 받기
    for(int i = 0; i < arr.length; i++){
      System.out.print( 1 + i + "번째 요소의 값 : ");
      arr[i] = sc.nextInt();
    }

//    입력 받은 값 확인
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }




  }
}
