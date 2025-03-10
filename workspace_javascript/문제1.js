// 1.정수로 이루어진 배열이 매개변수로 들어오면
//   해당 배열에서 짝수만 출력하는 함수를 선언하고 호출하세요.
function test1(arr){
  for(let i = 0; i < arr.length; i++){
    if(arr[i] % 2 === 0){
      console.log(arr[i]);
    }
  }
}
const test1_data = [1,2,3,4,5];
test1(test1_data);

// 2.정수로 이루어진 두 배열이 매개변수로 들어오면
//   두 배열의 모든 요소들의 평균을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.
const test2 = function(a, b){
  console.log((a+b)/2);
  return (a+b)/2;
}
let data = test2(10, 30);

// 3.문자열로 이루어진 배열이 매개변수로 전달되면
//   배열 각 요소의 글자 중 길이가 가장 긴 문자열을 리턴하는 함수를
//   화살표함수로 구현하고 호출해보세요.

