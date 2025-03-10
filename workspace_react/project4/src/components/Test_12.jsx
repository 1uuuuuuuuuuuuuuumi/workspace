import React, { useState } from 'react'

//입력받는거 시험 (체크박스X)
const Test_1 = () => {
  const [school, setSchool] = useState({
    name : '',
    email : '',
    pw : '',
    sub : '',
    gen : "m",
    ms : ''
  });

  const changeSc = (e) => {
    setSchool({
      ...school,
      [e.target.name] : e.target.value,
    })
  };

  

  return (
    <>
      이름 <input name='name' type="text" value={school.name} onChange={(e) => {
        changeSc(e);
      }}/>
      <br />
      
      이메일 <input name='email' type="text" value={school.email} onChange={(e) => {
        changeSc(e);
      }}/>
      <br />

      비밀번호 <input name='pw' type="password" value={school.pw} onChange={(e) => {
        changeSc(e);
      }}/>
      <br />

      학과
      <select name='sub' value={school.sub} onChange={(e) => {
        changeSc(e);
      }}>
        <option value={''}>학과를 선택하세요</option>
        <option value={'01'}>이과</option>
        <option value={'02'}>문과</option>
        <option value={'03'}>컴퓨터과</option>
        <option value={'04'}>체육과</option>
      </select>
      <br />

      성별
      <input
        name="gen"
        type="radio"
        value="m"
        onChange={(e) => {changeSc(e);}}
        checked={school.gen === 'm'}/> 남자
      <input name="gen" type="radio" value="w"
      onChange={(e) => {changeSc(e);}} checked={school.gen === "w"}/> 여자
      <br />

      자기소개
      <textarea name="ms" value={school.ms} onChange={(e) => {changeSc(e);}}></textarea>

      <p>이름 : {school.name}</p>
      <p>이메일 : {school.email}</p>
      <p>학과 : {school.sub}</p>
      <p>성별 : {school.gen}</p>
      <p>자기소개 : {school.ms}</p>
    </>
  )
}

export default Test_1