package practice;

//선생님이랑풀이함
public class ManTest {
  public static void main(String[] args) {
    Man m1 = new Man();
    m1.setName("홍길동");
    m1.setAge(30);
    m1.setAddress("울산시");
    m1.printInfo();

    // 이름 데이터 출력
    System.out.println(m1.name);
    System.out.println(m1.getName());

  }
}
