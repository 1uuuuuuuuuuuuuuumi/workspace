package test;

//5. 숫자 야구 게임을 아래의 요구사항을 만족할 수 있도록 만드시오.
public class Test5 {
  public static void main(String[] args) {
    int[] base = new int[3];

    for(int i = 0; i < base.length; i++){
      base[i] = (int)(Math.random() * 9 + 1);
    }
    for(int i = 0; i < base.length; i++){
      System.out.print(base[i] + " ");
    }
  }
}
