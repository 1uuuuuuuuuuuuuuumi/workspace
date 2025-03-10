package practice;

import java.util.Arrays;

public class 배열문제07_19 {
  public static void main(String[] args) {
//    19. 정수 10개를 담을 수 있는 배열을 생성하고,
//    Math.random()함수를 사용하여1 ~ 100의 정수를 배열 각 요소에 저장하자.
//    배열에 저장된 모든 정수 및 최소값, 최대값을 출력해보라.
//    (Math.random() 메소드는 0 <= x < 1 사이의 실수를 리턴한다.)

    int[] arr = new int[10];

//    배열의 각 요소에 데이터를 저장
    for(int i = 0; i < arr.length; i++){
//      0.0 <= x < 100.0 실수
      arr[i] = (int)(Math.random() * 100 + 1);
    }

//    배열 데이터 확인을 위한 출력
    System.out.println(Arrays.toString(arr)); // ★ 클래스로 출력하면 맞다고 인정해줌 ★

    int max = arr[0]; //0번째 요소를 가장 큰 값으로 가정
    int min = arr[0]; //0번째 요소를 가장 작은 값으로 가정

    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
      if(min > arr[i]){
        min = arr[i];
      }
    }
    System.out.println("최대값 : " + max);
    System.out.println("최소값 : " + min);


  }
}
