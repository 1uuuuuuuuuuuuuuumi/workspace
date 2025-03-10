package practice;

import java.util.ArrayList;
import java.util.List;

// 6. TestMember클래스에 main메소드를 만들어 위에서 만든
//    Member클래스의 객체를 저장할 수 있는 리스트를 만들어라.
//    그리고 3개의 Member객체를 저장하고 저장된 객체의 정보를 모두 출력하는 프로그램을 만드세요.
public class FiveMemberTest {
  public static void main(String[] args) {
    List<FiveMember> list = new ArrayList<>();
    FiveMember f1 = new FiveMember("java", "12345", "김자바", 30);
    FiveMember f2 = new FiveMember("javva", "1234567", "낌짜빠", 40);
    FiveMember f3 = new FiveMember("jjava", "31313313", "김짜바", 50);
    list.add(f1);
    list.add(f2);
    list.add(f3);
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }

// 7. List에 저장된 모든 회원의 나이의 합을 출력하여라.
    int sum = 0;
    for(int i = 0; i < list.size(); i++){

    }

  }
}
