
// 다음 객체를 사용하여 아래 문제들을 해결하세요.
const foodList = [
  {
    name : '김치찌개',
    price : 12000,
    type : '한식',
    material : ['김치','두부', '돼지고기']
  }, 
  {
    name : '짜장면',
    price : 8000,
    type : '중식',
    material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
    name : '불고기',
    price : 15000,
    type : '한식',
    material : ['소고기','양파', '대파']
  }, 
  {
    name : '탕수육',
    price : 25000,
    type : '중식',
    material : ['돼지고기','밀가루']
  }
];

console.log(foodList);

// 4. 매개변수로 foodList가 전달되면 모든 음식의 이름을 출력하는 함수를 화살표함수로 구현하고 호출하세요.

const test1 = (foodList) => {
  for(let i = 0; i < foodList.length; i++){
    console.log(foodList[i].name);
  }
}

// test1(foodList); 호출주석








// 5. 매개변수로 foodList가 전달되면
//    한식 음식의 가격의 합을 출력하는 함수를 함수표현식으로 구현하고 호출하세요.
const test2 = function(foodList){
  let sum = 0;
  for(let food of foodList){
    if(food.type === '한식'){
      sum = sum + food.price;
    }
  }
  console.log(`한식 가격의 합은 ${sum}원 입니다.`);
}
// test2(foodList); 호출주석







// 7. 첫번째 매개변수로 foodList, 두번째 매개변수로 음식명이 전달되면
//    전달된 음식명의 모든 요리재료를 출력하는 함수를 화살표함수로 구현하고 호출하세요.
//    만약, 두번째 매개변수로 전달된 음식명이 없다면 '정보없음'을 출력하세요.
const test4 = (list, foodName) => {
  for(let i = 0; i < list.length; i++){
    if(list[i].name === foodName){
      console.log(list[i].material);
      return;
    }
  }
  // 못찾았을때의 출력 기능
  // isFind가 false면 실행, true면 실행 안 함!
  // if(!isFind){
    console.log('정보없음')
  // }
}

test4(foodList, '김치찌개');

// 매개변수로 5보다 큰 숫자가 들어올때만 안녕 출력
function aaa(num){
  if(num > 5){
    console.log('안녕');
  }
}

// 매개변수로 5보다 큰 숫자가 들어올때만 안녕 출력
// return 키워드 작성 후 데이터를 작성하지 않으면 return을 만나면 함수 종료
function bbb(num){
  if(num < 5){
    return;
  }
  console.log('안녕');
}