package practicttttttttttttttt;

import java.util.Scanner;

public class StudentManagerTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // while문 실행여부 값을 갖고 있는 변수
    boolean isRunning = true;

    // 학생관리기능이 있는 StudentManager 클래스에 대한 객체 생성
    StudentManager manager = new StudentManager();

    System.out.println("학생 관리 프로그램을 실행합니다.");

    while(isRunning){
      System.out.print(" 1)학생등록  2)학생정보변경(연락처) 3)학생정보출력" +
                       "4)모든학생정보출력  5)프로그램 종료 : ");
      int option = sc.nextInt();
      switch(option){
        case 1:
          manager.regStudent();
          break;
        case 2:
          manager.setTelInfo();
          break;
        case 3:
          manager.printStuInfo();
          break;
        case 4:
          manager.printStuInfoAll();
          break;
        case 5:
          System.out.println("프로그램을 종료합니다.");
          isRunning = false; //while문 그만하세요!
          break;
        default:
          System.out.println("1~5번 중 하나의 정수를 입력해주세요.");

      }

    }

  }
}
