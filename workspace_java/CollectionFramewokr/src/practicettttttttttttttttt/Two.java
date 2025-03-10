package practicettttttttttttttttt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2. 정수를 저장할 수 있는 리스트를 만들고
//    5개의 정수를 scanner를 통해 입력받아 리스트에 저장한다.
//    리스트에 저장된 모든 데이터의 합을 출력하여라.
public class Two {
  public static void main(String[] args) {
    // 정수를 저장할 수 있는 리스트
    List<Integer> list = new ArrayList<>();

    // 키보드 입력을 위한 스캐너 생성
    Scanner sc = new Scanner(System.in);

    // 키보드로 정수를 입력받아, 리스트에 저장
    for(int i = 0; i < 5; i++){
      System.out.print(i + 1 + "번째 정수 입력 : ");
      int a = sc.nextInt();
      list.add(a);
    }

    // 리스트에 저장된 모든 데이터의 합을 출력
    int sum = 0;
    for(int i = 0; i < list.size(); i++){
      sum = sum + list.get(i);
    }

    System.out.println("sum = " + sum);

  }
}
