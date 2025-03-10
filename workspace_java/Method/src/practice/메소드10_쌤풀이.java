package practice;

import java.util.Arrays;

public class 메소드10_쌤풀이 {
  public static void main(String[] args) {

//5번 호출
//    int[] a = {5, 1, 7, 10};
//    test5(a);





//1번 호출
//    test1(7);




//2번 호출
//test2(10);





//3번 호출
//    int result = test3();
//    System.out.println(result);
//
//    System.out.println(test3());




//4번 호출
   //방법1 :
   //boolean result = isEven(6);

  // 방법2 : if(isEven(7)){



  // 방법3 : boolean result = isEven(9);
  //if(result){
  // }





//6번 호출
//    int[] arr = {1, 10, 100, 5, 2};
//    int maxData = test6(arr);
//    System.out.println(maxData);





//7번 호출
    String[] c = {"집에", "가고", "싶다"};
    String t = test7(c);
    System.out.println(t);






//9번 호출
    int[] arr1 = {5, 7, 10, 3};
    int[] result = test9(arr1);
    System.out.println(Arrays.toString(result));





  }






//9. 정수형 배열 하나를 매개변수로 받아 배열의 요소 중
//   홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.
//   배열은 배열 생성시 크기가 정해지면 크기 변경이 불가함!
  public static int[] test9(int[] arr){ //arr.length
    //arr = [1, 2, 3, 4, 5, 6]
    //newArr = [2, 4, 6]

    //매개변수로 전달된 배열에서 짝수만 갖는 새로운 배열 생성
    //0. 생성할 배열의 크기 구함
    // - 매개변수로 전달된 배열의 요소에서 짝수의 갯수를 파악
    int arrLength = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 == 0){
        arrLength++;
      }
    }

    //1. 배열 생성
    int[] newArr = new int[arrLength];

    //2. 매개변수로 전달된 배열의 요소 중 짝수만 newArr배열에 저장
    int index = 0; //newArr의 index를 파악하기 위한 변수
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 == 0){
        newArr[index] = arr[i];
        index++;

        //newArr[index++] = arr[i]; 위의코드랑 같음 !

      }
    }
    return newArr;
  }
















//7. 문자열 배열을 매개변수로 받아 배열에 저장된
//   모든 문자열을 나열하여 리턴하는 메소드를 만들고 호출해보세요.
  public static String test7(String[] arr){ // ["aa", "bb", "cc"]
    String result = "";
    for(int i = 0; i < arr.length; i++){
      result = result + arr[i];
    }

    return result;


//    result = result + "java"; //result += "java"
//    System.out.println(result); //"java"





    }

//














//6. 정수형 배열을 매개변수로 받아 배열의 모든 요소 중
//   최대값을 리턴하는 메소드를 만들고 호출해 보세요.
  public static int test6(int[] arr){ // [1 5 7 3] max = 1
    int max = arr[0];

    for (int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;

  }











//4. 정수 하나를 매개변수로 받아, 매개변수가 짝수면 true,
//   홀수면 false를 리턴하는 메소드를 만들고 활용해보자.
  public static boolean isEven(int num){
    return num % 2 == 0;
  }









//3. Math.random() 메소드를 활용하여 1~ 50의 수 중
//   랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.
  public static int test3(){
    // 0.0 <= x < 1.0 실수 리턴
    return (int)(Math.random() * 50 + 1);
  }










//2. 정수 하나를 매개변수로 받아, 1 ~ 100까지의 수 중에서
//   매개변수로 받은 수의 배수를 출력하는 메소드를 만들고 호출해보세요.
public static void test2(int num){
    for(int i = 1; i < 101; i++){
      if(i % num == 0){
        System.out.print(i + " ");
      }
    }
}









//1. 정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요.
  public static void test1(int num){
    for (int i = 1; i < 10; i++){
      System.out.println(num + " * " + i + " = " + num * i);
    }
    //2 * 1 = 2
    //2 * 2 = 4
    //2 * 3 = 6
    //...
    //2 * 9 = 18
  }









//5. 정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.
  public static void test5(int[] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }

}
