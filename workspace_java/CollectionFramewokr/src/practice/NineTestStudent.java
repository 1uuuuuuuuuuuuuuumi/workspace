package practice;

import java.util.ArrayList;
import java.util.List;

// TestStudent 라는 클래스를 만들어, 위에서 만든 Student클래스의 객체가 저장되는 리스트를 만들어
// 3명의 학생 정보를 추가한 다음, 아래 문제를 풀어보세요
// 1) 리스트에 저장된 모든 정보를 출력해보세요.
// 2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
// 3) 모든 학생에 대한 평균 점수를 출력하세요.
// 4) 총점이 1등인 학생의 모든 정보를 출력해보세요.
public class NineTestStudent {
  public static void main(String[] args) {
    List<NineStudent> list = new ArrayList<>();
    NineStudent s1 = new NineStudent("김자바", 70, 90);
    NineStudent s2 = new NineStudent("홍자바", 1, 1);
    NineStudent s3 = new NineStudent("박자바", 33, 44);
    list.add(s1);
    list.add(s2);
    list.add(s3);

    // 리스트에 저장된 모든 정보를 출력해보세요.
//    for(int i = 0; i < list.size(); i++){
//      System.out.println(list.get(i));
//    }

    // 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
//    for(int i = 0; i < list.size(); i++){
//      if(list.get(i).getTotal() >= 150){
//        System.out.println(list.get(i));
//      }
//    }

    // 모든 학생에 대한 평균 점수를 출력하세요.
    int a = 0;
    for(int i = 0; i < list.size(); i++){
      a = a + list.get(i).getTotal();
    }
      System.out.println(a);

    int b = 0;
    for(int i = 0; i < list.size(); i++){

    }

  }
}
