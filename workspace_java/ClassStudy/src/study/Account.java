package study;

// 맴버변수 초기값을 갖는 것이 좋은 코드다!

import java.security.PublicKey;

// 계좌 정보
public class Account {
  String accNumber; //"1111-2222"
  int money; //예금액
  String owner; //계좌주

  // 생성자(constructor) - 맴버변수의 값의 초기값을 할당할 목적!
  // 생성자는 메서드의 일종이다 라고 생각!!
  // 만약 클래스에 생성자가 하나도 없다면 자동으로 기본생성자를 생성함
  // 기본생성자(default 생성자)
//  public Account(){
//    /
//  }


  public Account(){
    accNumber = "지정되지 않음";
    money = 10000;
    owner = "지정되지 않음";
  }

//  맴버변수의 값을 초기화하는 기능
  public void initAcc(String accNumber, int money, String owner){
    this.accNumber = accNumber;
    this.money = money;
    this.owner = owner;
  }

//  매개변수로 전달된 금액을 예금액에 더하는 메서드
  public void deposit(){
    this.money = this.money + money;
  }

  public void printAccInfo(){
    System.out.println("계좌번호 : " + accNumber);
    System.out.println("예금액 : " + money);
    System.out.println("계좌주 : " + owner);
  }



}
