package practice;

import javax.sound.midi.Soundbank;

public class 클래스기초11_1 {

// 6. 휴대폰는 제조사, 모델명, 색상, 가격, 휴대폰 번호를 데이터로 가지고 있다. 이 데이터를 가진 Phone 클래스를 만들어 보세요.
  String name;
  String phoneName;
  String color;
  int price;
  int phoneNum;

// 7. 휴대폰의 각각의 데이터를 변경하는 메소드를 만들어보세요.
  public void setName(String name1){
    name = name1;
  }

  public void setPhoneName(String phoneName1){
    phoneName = phoneName1;
  }

  public void setColor(String color1){
    color = color1;
  }

  public void setPrice(int price1){
    price = price1;
  }

  public void setPhoneNum(int phoneNum1){
    phoneNum = phoneNum1;
  }



// 8. 휴대폰의 모든 데이터를 출력하는 메소드를 만들고, 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인하세요.
  public void printInfo(){
    System.out.println("제조사 : " + name);
    System.out.println("모델명 : " + phoneName);
    System.out.println("색상 : " + color);
    System.out.println("가격 : " + price);
    System.out.println("휴대폰 번호 : " + phoneNum);
  }



}
