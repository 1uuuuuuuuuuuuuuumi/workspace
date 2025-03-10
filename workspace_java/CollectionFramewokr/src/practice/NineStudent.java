package practice;

// 9. Student는 학생에 대한 정보가 들어있는 클래스이다.
//    해당 클래스는 학생이름, 국어점수, 영어점수, 총점데이터를 가지고 있다.
//    각 필드를 선언하고 setter와 getter를 만들어보자.
//    추가적으로 모든 정보를 출력하는 기능을 toString()메소드를 오버라이딩하여 작성한다.
public class NineStudent {
  private String name;
  private int kor;
  private int eng;
  private int total;

  public NineStudent(String name, int kor, int eng) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.total = kor + eng;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "NineStudent{" +
            "name='" + name + '\'' +
            ", kor=" + kor +
            ", eng=" + eng +
            ", total=" + total +
            '}';
  }
}
