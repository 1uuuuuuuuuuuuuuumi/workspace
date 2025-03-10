// 1. 이름, 부서, 직급, 급여의 네 개의 데이터를 갖는 객체 emp를 생성해보세요.
//   각 데이터의 값은 임의의 값으로 설정하면 됩니다.

const emp = {
  name : 'kim',
  dept : '개발부',
  job : '대리',
  salary : 10000
};


// 2. 5번에서 만든 emp 객체 하나를 매개변수로 받아, 전달받은 객체의 부서가 '개발부'라면
//    해당 객체의 급여를 출력하고, '개발부'가 아니라면 '부서가 잘못되었습니다'를 출력하는
//    함수를 화살표함수로 구현하고 호출하세요.
const test1 = (emp) => {
  console.log(emp.dept === '개발부' ? emp.salary : '부서가 잘못되었습니다.');
};

// test1(emp);

const data = [
  {
    name : 'kim',
    age : 20,
    scores : [50, 60, 70]
  }, 
  {
    name : 'lee',
    age : 30
  }, 
  {
    name : 'hong',
    age : 40
  }
];

// console.log(data[0].scores[1]);






////////////////////////////////////////////////////////////

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


// 4. 매개변수로 foodList가 전달되면
//    모든 음식의 이름을 출력하는 함수를 화살표함수로 구현하고 호출하세요.
const test4 = (foodList) => {
  for(let i = 0; i < foodList.length; i++){
    console.log(foodList[i].name);
  }
}
test4(foodList);



// 5. 매개변수로 foodList가 전달되면
//    한식 음식의 가격의 합을 출력하는 함수를 함수표현식으로 구현하고 호출하세요.