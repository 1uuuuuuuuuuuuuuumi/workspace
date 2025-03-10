// 1.정수로 이루어진 배열이 매개변수로 들어오면
//   해당 배열에서 짝수만 출력하는 함수를 선언하고 호출하세요.
function test1(arr){
  for(let i = 0; i < arr.length; i++){
    if(arr[i] % 2 === 0){
      console.log(arr[i]);
    }
  }
}
//const test_data = [1,2,3,4,5,6,7];
//test1(test_data);








// 2.정수로 이루어진 두 배열이 매개변수로 들어오면
//   두 배열의 모든 요소들의 평균을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.
const test2 = function(arr1, arr2){
  // 첫번째 배열의 합
  const sum1 = getArrSum(arr1);

  // 두번째 배열의 합
  const sum2 = getArrSum(arr2);

  // 두개를 더해.
  return (sum1 + sum2) / (arr1.length + arr2.length);
};

// 배열의 합을 구하는 함수
function getArrSum(arr){
  let sum = 0;
  for(const e of arr){
    sum = sum + e;
  }
  return sum;
}

// const data1 = [1,2,3,4];
// const data2 = [5,6];
// const result = test2(data1, data2);
// console.log(result);






// 3.문자열로 이루어진 배열이 매개변수로 전달되면
//   배열 각 요소의 글자 중 길이가 가장 긴 문자열을 리턴하는 함수를
//   화살표함수로 구현하고 호출해보세요.

  //가정) arr = ["aaa", "bbbb", "cc"];
const test3 = (arr) => {
  //배열의 0번째 요소를 가장 긴 문자열이라고 가정
  let longest_word = arr[0];
  for(let i = 0; i < arr.length; i++){
    if(arr[i].length > longest_word.length){
      longest_word = arr[i];
    }
  }
  return longest_word;
}
const result = test3(['java', 'python', 'c#']);
console.log(result);