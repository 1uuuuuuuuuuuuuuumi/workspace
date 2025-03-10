package practicettttttttttttttttt;

// 6.TestMember클래스에 main메소드를 만들어 위에서 만든
//   Member클래스의 객체를 저장할 수 있는 리스트를 만들어라.
//   그리고 3개의 Member객체를 저장하고 저장된 객체의 정보를 모두 출력하는 프로그램을 만드세요.
import practice.FiveMember;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class FiveMemberTest {
  public static void main(String[] args) {
    // member 클래스의 객체를 저장할 수 있는 리스트를 생성
    List<FiveMember> memberList = new ArrayList<>();

    // 3개의 Member 객체를 리스트에 저장
    // Member 객체를 3개 생성
    FiveMember m1 = new FiveMember("java1", "1111", "김자바", 20);
    FiveMember m2 = new FiveMember("java2", "2222", "이자바", 30);
    FiveMember m3 = new FiveMember("java3", "3333", "홍자바", 40);

    // 생성한 3개 객체를 리스트에 저장
    memberList.add(m1);
    memberList.add(m2);
    memberList.add(m3);

    // 저장된 객체의 정보를 모두 출력
    // 리스트에 저장된 객체 수만큼 반복...
    for(int i = 0; i < memberList.size(); i++){
      // 출력문 안에 객체(명)이 있다면 toString() 메서드 호출
      System.out.println(memberList.get(i));
      //System.out.println(memberList.get(i).toString()); 동일
    }

    System.out.println();

    /// ////////////////////////////////////////////////////////////////

    // 7. List에 저장된 모든 회원의 나이의 합을 출력하여라.
    int ageSum = 0;
    for(FiveMember member : memberList){
      ageSum = ageSum + member.getAge();
    }

    System.out.println("나이 합계 : " + ageSum);
    System.out.println();

    /// ////////////////////////////////////////////////////////////////

// 8. List에 저장된 회원 중 id가 java인 회원을 지우는 코드를 작성하세요.
    // list에 저장된 데이터 하나하나에 접근하여 id가 "java"인지 확인
    for(int i = 0; i < memberList.size(); i++){
      if(memberList.get(i).equals("java")){
        // 리스트 객체명.remove(index)
        memberList.remove(i);
        break;
      }
    }

  }
}
