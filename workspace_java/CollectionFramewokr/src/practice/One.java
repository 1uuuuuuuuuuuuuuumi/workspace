package practice;

import java.util.ArrayList;
import java.util.List;


// 1. 문자열을 저장하는 리스트를 만들고 3개의 데이터를 넣어보자. 그 후 리스트에 저장된 3개의 데이터를 출력해보라.
public class One {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    System.out.println(list);

  }
}
