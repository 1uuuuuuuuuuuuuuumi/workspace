package practice;


// 16. Student 클래스를 아래의 문제를 풀면서 완성하시오.
// 4) Student 클래스에 모든 멤버의 값을 출력하는 메소드를 만드세요.

public class Student2 {

//  1) Student 클래스는 이름, 나이, 주소, 학번, 연락처를 멤버로 가지고 있습니다.
//     각각의 데이터를 저장할 맴버변수를 선언하고 모든 맴버변수를 초기화 하는 메소드를 만드세요.
  private String name;
  private int age;
  private String add;
  private int num;
  private String tel;

//  2) Student 클래스에서 맵버변수 각각의 값을 변경하는 메소드를 만드세요.
  public void initMember(String name, int age, String add, int num, String tel){
    this.name = name;
    this.age = age;
    this.add = add;
    this.num = num;
    this.tel = tel;
  }

//  3) Student 클래스에서 각각의 맴버변수 값을 리턴하는 메소드를 만드세요.
  public void getName(){
    return ;
  }

  public void printAll(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + add);
    System.out.println("학번 : " + num);
    System.out.println("연락처 : " + tel);
  }


}
