import React, { useState } from "react";

const InputTest = () => {
  const [data, setData] = useState({
    id : '',
    age : '',
    name : ''
  });

  const changeData = (e) => {
    setData({
      ...data,
          [e.target.name] : e.target.value //key값은 변수로 사용할수없음
    })
  }

  return (
    <>
      <div>InputTest</div>

      <div>id : <input type="text" onChange={(e) => {
        //input 태그에 입력한 값을 data변수의 id 키값에 저장
        e.target.value;
        setData({
          ...data,
          id : e.target.value
        });
      }}/></div>

      <div>나이 : <input type="text" onChange={(e) => {
        setData({
          ...data, //원래있는 데이터 값은 그대로놔두고
          age : e.target.value //나이에있는 벨류값만 바꾸겠다
        });
      }}  /></div>


      <div>이름 : <input type="text" name="name" onChange={(e) => {changeData(e)}}/></div>
    </>
  );
};

export default InputTest;
