package practice;

import java.util.ArrayList;
import java.util.List;

// 4. 리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
//    그 후  저장된 데이터 중 짝수의 개수와 모든 짝수를 출력하는 프로그램을 만드세요.
//    (Math.random()이라는 메소드는 0 <= x < 1의 실수를 리턴)
public class Four {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < 9; i++){
      int a = (int)(Math.random() * 100);
      list.add(a);
    }

    int num = 0;
    for(int i = 1; i <= list.size(); i++){
      if(i % 2 == 0){
        num = num + list.get(i);
        System.out.println(i);
      }
    }
    System.out.println("짝수 : " + num);
  }
}
