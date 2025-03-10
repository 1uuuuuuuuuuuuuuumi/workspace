import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const MemberJoin = () => {
  const nav = useNavigate();

  //입력한 모든정보를 저장할 state 변수
  const [regData, setRegData] = useState({
    memId: "", //자바가 데이터를 받으려면 MemberDTO의 변수랑 같아야함
    memName: "",
    memPw: "",
    memTel: "",
    memIntro: "",
    pwConfirm: "",
  });

  //input 태그에 값 입력시 실행 할 함수
  const changeRegData = (e) => {
    setRegData({
      ...regData,
      [e.target.name]: e.target.value,
    });
  };

  const validateRegData = () => {
    let isValid = true;
    if (regData.memId === "") {
      alert("ID는 필수입력입니다.");
      isValid = false;
    }
    if (regData.memName === "") {
      alert("이름은 필수입력입니다.");
      isValid = false;
    }
    if (regData.memPw !== regData.pwConfirm) {
      alert("입력한 비번을 확인하세요");
      isValid = false;
    }

    return isValid;
  };

  //가입 버튼 클릭 시 실행 함수
  const regMember = () => {
    //데이터 유효성 검사(validation 처리)
    if (!validateRegData()) {
      return;
    }

    axios
      .post("/api/members", regData)
      .then((res) => {
        if (res.data !== 1) {
          alert("알수 없는 이유로 오류가 발생했습니다.");
          return;
        }

        alert(`${regData.memId}님 가입을 축하합니다.`);
        nav("/");
      })
      .catch((error) => {
        console.log(error);
      });
  };

  console.log(regData);
  return (
    <>
      <div>회원 등록</div>
      <div>
        아이디 :{" "}
        <input
          type="text"
          value={regData.memId}
          name="memId"
          onChange={(e) => {
            changeRegData(e);
          }}
        />
      </div>
      <div>
        이름 :{" "}
        <input
          name="memName"
          type="text"
          value={regData.memName}
          onChange={(e) => {
            changeRegData(e);
          }}
        />
      </div>
      <div>
        비밀번호 :{" "}
        <input
          name="memPw"
          type="password"
          value={regData.memPw}
          onChange={(e) => {
            changeRegData(e);
          }}
        />
      </div>
      <div>
        비밀번호확인 :{" "}
        <input
          name="pwConfirm"
          type="password"
          value={regData.pwConfirm}
          onChange={(e) => {
            changeRegData(e);
          }}
        />
      </div>
      <div>
        연락처 :{" "}
        <input
          name="memTel"
          type="text"
          value={regData.memTel}
          onChange={(e) => {
            changeRegData(e);
          }}
        />
      </div>
      <div>
        회원소개 :{" "}
        <input
          name="memIntro"
          type="text"
          value={regData.memIntro}
          onChange={(e) => {
            changeRegData(e);
          }}
        />
      </div>
      <button
        type="button"
        onClick={(e) => {
          regMember();
        }}
      >
        가입
      </button>
    </>
  );
};

export default MemberJoin;
