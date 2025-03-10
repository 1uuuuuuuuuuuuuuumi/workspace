package static_study;

public class Account {
  String owner;
  int money;
  static double iyul; // 이율

  static {
    iyul = 5.0;
  }

  public Account (String owser){
    this.owner = owser;
    money = 50000;

  }
}
