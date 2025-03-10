import React from "react";

const Map_forEach = () => {
  function aaa(){
    console.log(3);
  }

  //반복문 : for, for of, forEach(), map()

  const arr = [1,3,5];
  //forEach()
  //() 안의 내용을 반복 실행!  => 반복만하고 끝남 = for문사용할때
  arr.forEach((item, i) => {
    console.log(`a = ${item}, b = ${i}`);
  });

  //() 안의 내용을 반복 실행!  => 리턴함 = 리액트에서는 Map을 자주 사용
  const result = arr.map((e, i) => {
    console.log(`e = ${e}, i = ${i}`)
    return e * 2;
  });
  console.log(result)



  return (  //리액트의 리턴문은 화면에 뿌려준다
    <>
      <div>Map_forEach</div>
    </>
  );
};

export default Map_forEach;
