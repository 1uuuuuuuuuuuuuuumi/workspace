import javax.security.auth.kerberos.KerberosPrincipal;
import java.util.Scanner;

public class 연습 {
  public static void main(String[] args) {

    int kor;
    int eng;
    int math;
    int total;
    double avg;

    Scanner sc = new Scanner(System.in);

    System.out.println("국어점수 : ");
    kor = sc.nextInt();

    System.out.println("영어점수 : ");
    eng = sc.nextInt();

    System.out.println("수학점수 : ");
    math = sc.nextInt();

    total = kor + eng + math;
    avg = total / 3.0;

    System.out.println("국어점수 : " + kor);
    System.out.println("수학점수 : " + math);
    System.out.println("영어점수 : " + eng);
    System.out.println("총점 : " + total);
    System.out.println("평균 : " + avg);


  }
}
