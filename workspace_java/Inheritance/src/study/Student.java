package study;

public class Student {
  int stuNum; //학번
  String name;

  public Student(int sutNum, String name) {
    this.stuNum = sutNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student)obj;

   if(stuNum == student.stuNum){
     return true;
   } else {
     return false;
   }
  }
}
