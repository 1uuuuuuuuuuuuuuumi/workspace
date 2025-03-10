package practice;

public class MemberTest {
  public static void main(String[] args) {
//4. 실행 클래스를 만들어 이름을 ‘자바’, 아이디는  ‘java’,
//   비밀번호는  ‘123’으로 변경하고 출력메소드를 사용하여 결과를 확인하여라.
    Member mem = new Member();

    mem.setName("김자바");
    mem.setId("java");
    mem.setPw("123");
    mem.displayInfo();

  }
}
