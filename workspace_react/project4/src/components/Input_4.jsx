import React, { useState } from "react";

const Input_4 = () => {
  //모든 입력정보를 저장할 state 변수 생성
  const [memberInfo, setMemberInfo] = useState({
    name: "",
    tel: "",
    email: "",
    major: "국어",
  });

  //모든 input태그의 값이 변경될때 실행할 함수
  //input 태그에 입력한 정보를 memberInfo에 저장(변경)하는 기능
  const changeMemberInfo = (e) => {
    setMemberInfo({
      ...memberInfo,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <>
      이름{" "}
      <input
        name="name"
        type="text"
        value={memberInfo.name}
        onChange={(e) => {
          changeMemberInfo(e);
        }}
      />
      <br />
      연락처{" "}
      <input
        name="tel"
        type="text"
        value={memberInfo.tel}
        onChange={(e) => {
          changeMemberInfo(e);
        }}
      />
      <br />
      이메일{" "}
      <input
        name="email"
        type="text"
        value={memberInfo.email}
        onChange={(e) => {
          changeMemberInfo(e);
        }}
      />
      <br />
      희망과목
      <select
        value={memberInfo.major}
        onChange={(e) => {
          changeMemberInfo(e);
        }}
      >
        <option value="국어">국어</option>
        <option value="영어">영어</option>
        <option value="수학">수학</option>
      </select>{" "}
      <br />
      <div>
        <h3>작성내용</h3>
        <p>이름 - {memberInfo.name}</p>
        <p>연락처 - {memberInfo.tel}</p>
        <p>이메일 - {memberInfo.email}</p>
        <p>희망과목 - {memberInfo.major}</p>
      </div>
    </>
  );
};

export default Input_4;
