package practice;

import java.util.ArrayList;
import java.util.List;

// 3. 이름을 저장하는 리스트를 만들고 리스트에 적당히 데이터를 저장한다.
// 그 후 저장된 이름 중 ‘홍길동’이라는 이름이 있다면
// ‘해당 이름이 존재합니다.’라는 문구를 출력하는 프로그램을 만들어라
public class Three {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    String a = "김길동";
    String b = "홍길동";
    String c = "박길동";
    list.add(a);
    list.add(b);
    list.add(c);
    for(int i = 0; i < list.size(); i++){
        if(list.get(i).equals("홍길동")){
          System.out.println("해당 이름이 존재합니다.");
      }
    }
  }
}
