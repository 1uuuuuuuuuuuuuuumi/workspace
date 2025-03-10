import React, { useEffect, useState } from "react";

//useEffect : 컴포넌트의 생애주기에 따라 기능을 구현하는 훅
//            + useEffect안의 내용은 화면 다 그린 후 가장 마지막에 실행
//컴포넌트의 생애주기
// 1. mount : 컴포넌트가 최초 렌더링 되는 시점
// 2. update : 컴포넌트가 리렌더링 되는 시점
// 3. unmount : 컴포넌트가 더이상 사용되지 않아 화면에서 사라지는 시점

//useEffect(실행 코드, 의존성 배열);  *의존성 배열은 필요할때만 작성
const useEffectTest = () => {
  const [num, setNum] = useState(0);
  const [age, setAge] = useState(20);

  //컴포넌트가 마운트 될때 + 컴포넌트가 리렌더링 될때
  useEffect(() => {
    console.log(1);
  });

  //컴포넌트가 마운트 될때
  useEffect(() => {
    console.log(2);
  }, []);

  //컴포넌트가 마운트 될때
  //num 이라는 state 변수의 변경으로 리렌더링 될때도 실행
  useEffect(() => {
    console.log(3);
  }, [num]);

  //마운트 될 때 실행
  //age 값이 변경되어 리렌더링 될 때
  useEffect(() => {
    console.log(4);
  }, [age]);

  useEffect(() => {
    console.log(5);
  }, [age, num]); //둘 중에 하나라도 변경되면 실행해 주겠다.

  //mount 될때도 실행
  //return문 안의 내용은 unmount 시점에 실행 됨
  useEffect(() => {
    // console.log(6); 지우면 unmount 실행
    return () => { //return → unmount될때만 실행하겠습니다~
      console.log(7);
    }
  }, []);

  return (
    <>
      <div>UseEffectTest</div>
      <button type="button" onClick={(e) => setNum(num + 1)}>
        num 버튼
      </button>
      <button type="button" onClick={(e) => setNum(age + 1)}>
        age 버튼
      </button>
    </>
  );
};

export default useEffectTest;
