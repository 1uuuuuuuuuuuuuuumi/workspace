package practicettttttttttttttttt;

import java.util.ArrayList;
import java.util.List;

// 4. 리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
//    그 후  저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
//    (Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)
public class Four {
  public static void main(String[] args) {
    // 정수를 다수 저장할 수 있는 list 객체 생성
    List<Integer> list = new ArrayList<>();

    // 10번 반복하면서...
    for(int i = 0; i < 10; i++){
      // 리스트에 1~100까지의 랜덤한 정수를 넣는다.
      // -> 1~100까지의 랜덤한 정수 생성
      // 0.0 <= x < 1.0 실수 리턴
      // (int)(Math.random() * 100 + 1);
      // -> 생성한 정수를 리스트에 넣는다.
      list.add((int)(Math.random() * 100 + 1));
    }

    // 문제의 답이 맞는지 확인하기 위해 리스트의 모든 데이터를 먼저 출력 ***번외***
    for(int e : list){
      System.out.print(e + " ");
    }

    System.out.println();

    // 저장된 데이터 중 짝수의 개수와 모든 짝수 출력
    // 리스트에 저장된 데이터 수만큼 반복하면서 짝수인지 확인
    int cnt = 0; //짝수의 갯수를 저장할 변수
    for(int i = 0; i < list.size(); i++){
      // 리스트에 저장된 하나하나의 데이터가 짝수인지 확인
      if(list.get(i) % 2 == 0){
        // 모든 짝수 출력
        System.out.print(list.get(i) + " ");
        //(짝수일때) cnt 값을 1 증가시킨다.
        cnt++;
      }
    }

    System.out.println();

    // 짝수의 갯수를 출력
    System.out.println("cnt = " + cnt);

  }
}
