package practice;

public class Member {
//1. Member 클래스는 필드로 이름, 아이디, 비밀번호를 갖는다. 모든 필드를 선언
  private String name;
  private String id;
  private String pw;

//기본 생성자와 클래스의 모든 데이터를 변경할 수 있는 생성자를 만드시오.
  public Member(){
    this.name = "";
    this.id = "";
    this.pw = "";
  }

  public Member(String name, String id, String pw){
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setPw(String pw){
    this.pw = pw;
  }

  public String getName(){
    return name;
  }

  public String getId(){
    return id;
  }

  public String getPw(){
    return pw;
  }


//3. 모든 필드의 값을 출력하는 displayInfo() 메소드를 만들어라.
  public void displayInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("패스워드 : " + pw);
  }

















}
