package practice;

public class T_6_test {
  public static void main(String[] args) {
    // 객체 생성
    T_6 p1 = new T_6();

    // 객체의 모든 정보 변경
    p1.setBrand("Samsung");
    p1.setModelName("S25");
    p1.setColor("Red");
    p1.setPrice(1000);
    p1.setTel("010-1111-5522");

    // 객체의 모든 내용 출력
    p1.showInfo();

  }
}
