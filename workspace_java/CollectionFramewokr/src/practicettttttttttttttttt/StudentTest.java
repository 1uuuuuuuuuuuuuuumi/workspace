package practicettttttttttttttttt;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
  public static void main(String[] args) {
    // Student 클래스의 객체가 다수 저장될 수 있는 리스트 생성
    // 자료형 변수명 = ;
    List<Student> studentList = new ArrayList<>();

    // 리스트에 Student 객체 3개 저장
//    Student s1 = new Student("김자바", 80, 90);
//    studentList.add(s1);

    studentList.add(new Student("김자바", 80, 90)); //바로위의코드와 동일함
    studentList.add(new Student("이자바", 80, 70));
    studentList.add(new Student("박자바", 60, 60));

// 1) 리스트에 저장된 모든 정보를 출력해보세요.
    for(int i = 0; i < studentList.size(); i++){
      System.out.println(studentList.get(i));
    }
    System.out.println();
/// ///////////////////////////////////////////////////////////////
// 2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
    for(Student student : studentList){
      if(student.getTotalScore() >= 150){
        System.out.println(student);
      }
    }
    System.out.println();
/// ///////////////////////////////////////////////////////////////
// 3) 모든 학생에 대한 총점에 대한 평균 점수를 출력하세요.
    //모든 학생의 총점을 가져와 합한 후 3으로 나눈다.
    int sum = 0;
    for(int i = 0; i < studentList.size(); i++){
      sum += studentList.get(i).getTotalScore();
      // sum += 10; sum = sum + 10;
      // sum *= 3; sum = sum * 3;
    }
    double avg = (double)sum / studentList.size();
    System.out.println("학생들의 평균 : " + avg);
    System.out.println();
/// ///////////////////////////////////////////////////////////////
// 4) 총점이 1등인 학생의 모든 정보를 출력해보세요.
    // 총점이 가장 높은 학생의 index를 구해야 함.
    int maxIndex = 0;
    for(int i = 0; i < studentList.size(); i++){
      if(studentList.get(i).getTotalScore() > studentList.get(maxIndex).getTotalScore()){
        maxIndex = i;
      }
    }
    System.out.println(studentList.get(maxIndex));




  }
}
