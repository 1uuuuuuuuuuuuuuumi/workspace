package test;

public class Member {
  private String memId;
  private String memPw;
  private String name;
  private int age;

  void setInfo(String memId, String memPw, String name, int age){
    this.memId = memId;
    this.memPw = memPw;
    this.name = name;
    this.age = age;
  }

  void showInfo(String memId, String memPw){
    System.out.println("로그인");
  }

  public boolean isLogin(String id, String pw){
    return id.equals("java") && pw.equals("1234") ? true : false;
  }


//  ----------------------------------------------------------------


  public static void main(String[] args) {
    Member member = new Member();


    boolean login = member.isLogin("java", "1111");

    if(login){
      System.out.println("로그인 가능");
      member.isLogin("java", "1234");
    }
    else {
      System.out.println("로그인 불가능");
    }

  }
}
