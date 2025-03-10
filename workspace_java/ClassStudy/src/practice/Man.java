package practice;

//선생님이랑풀이함
import javax.naming.Name;

public class Man {
// 1) Man 클래스는 이름, 나이, 주소를 멤버로 가지고 있다. 모든 멤버변수를 선언하세요.
  String name;
  int age;
  String address;


// 2) 맴버변수의 모든 값을 초기화 할 수 있는 메소드를 만드세요.
  public void initMember(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

// 3) 맴버변수 각각의 값을 변경하는 메소드를 3개를 만드세요.
//  setter 만드세요~ 와 동일한 말.
//  setter -> 맴버변수 하나의 값을 변경시키는 메서드
//         -> setter 메서드는 이름이 정해져 있음(set맴버변수명)

  // name값을 변경하는 setter 메서드 생성
  public void setName(String name){
    this.name = name;
  }

  // age값을 변경하는 setter 정의
  public void setAge(int age){
    this.age = age;
  }

  public void setAddress(String address){
    this.address = address;
  }

// 4) 각 맴버변수의 값을 리턴하는 메소드를 3개 만드세요.
  // name을 리턴하는 메서드
  // getter -> 맴버변수 하나의 값을 리턴하는 메서드
  //        -> 메서드의 이름 : get변수명
  public String getName(){
    return name;
  }

  // age를 리턴하는 메서드
  public int getAge(){
    return age;
  }

  public String getAddress(){
    return address;
  }

// 5) 맴버변수의 모든 정보를 출력하는 메소드를 만드세요.
  public void printInfo(){
    System.out.println("이름 : " + getName());
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + address);
  }





}
