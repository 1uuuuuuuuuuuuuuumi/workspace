package practice;

public class T_9 {
// 회원정보를 관리하기 위한 Member 클래스를 아래 문제를 풀어 완성하세요. (9 ~ 12)
// 9. 회원정보로는 이름, 아이디, 비밀번호, 나이를 관리할 것이다. 이 데이터를 가지는 클래스를 만들어 보세요.
  String name;
  String id;
  String pw;
  int age;

// 10. 회원의 모든 정보를 변경하는 기능을 가진 메소드를 만들어보세요.
  public void setAllInfo(String name, String id, String pw, int age){
    //이 클래스에서 정의된 name
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  public void printAll(){
    System.out.println("이름 : " + name);
    System.out.println("ID : " + id);
    System.out.println("PW : " + pw);
    System.out.println("나이 : " + age);
  }

}
