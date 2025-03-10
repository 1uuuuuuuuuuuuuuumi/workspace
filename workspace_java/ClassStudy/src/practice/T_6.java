package practice;

public class T_6 {
// 6. 휴대폰는 제조사, 모델명, 색상, 가격, 휴대폰 번호를 데이터로 가지고 있다. 이 데이터를 가진 Phone 클래스를 만들어 보세요.
  String brand;
  String modelName;
  String color;
  int price;
  String tel;

// 7. 휴대폰의 각각의 데이터를 변경하는 메소드를 만들어보세요.
  //brand 변경 메서드
  public void setBrand(String brand1){
    brand = brand1;
  }

  public void setModelName(String modelName1){
    modelName = modelName1;
  }

  public void setColor(String color1){
    color = color1;
  }

  public void setPrice(int price1){
    price = price1;
  }

  public void setTel(String tel1){
    tel = tel1;
  }

// 8. 휴대폰의 모든 데이터를 출력하는 메소드를 만들고, 새로운 클래스를 만들어 7,8번에서 만든 메소드가 잘 동작되는지 확인하세요.
  public void showInfo(){
    System.out.println("브랜드 : " + brand);
    System.out.println("모델명 : " + modelName);
    System.out.println("가격 : " + price);
    System.out.println("색상 : " + color);
    System.out.println("연락처 : " + tel);
  }

}
