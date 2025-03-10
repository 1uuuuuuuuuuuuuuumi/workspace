import React, { useState } from 'react' //React와 useState 훅을 가져옴

const Input_2 = () => { //상태변수선언: 초기값은 빈 문자열
  // //이름을 입력하는 input 태그에 작성한 내용을 저장할 state 변수
  // const [name, setName] = useState(''); //이름을 저장할 변수
  // const [age, setAge] = useState(''); //나이를 저장할 변수
  // const [addr, setAddr] = useState(''); //주소를 저장할 변수

  //모든 input태그에 입력한 데이터를 저장할 state 변수
  const [data, setData] = useState({
    name : '',
    age : '',
    addr : ''
  });

  //input태그의 값이 변경되는 실행시킬 함수
  function changeData(e){
    setData({
      ...data, //스프레드연산자는 객체랑 배열에서 사용할수있음
      [e.target.name] : e.target.value //객체에서는 왼쪽이 key값 , 오른쪽은 value값
      //key값을 취급할땐 대괄호
    });
  }


  return (
    // <>
    //   이름 입력 필드
    //   이름 : <input type="text" value={name} onChange={(e) => {
    //     // 값이 변경될때마다 이름의 값을 바꾸겠다
    //     setName(e.target.value); //키보드로 입력한 벨류속성값을 name에 넣어주세요
    //   }} />
      
    //   <br />

    //   {/* 나이 입력 필드 */}
    //   나이 : <input type="text" value={age} onChange={(e) => {
    //     //input 태그의 값이 변경될때마다(input 태그에 입력할때마다)
    //     //input 태그에 작성한 데이터를 age변수에 저장한다
    //     setAge(e.target.value); //e.target => 이벤트가 발생한 태그
    //     //내가 실제로 액션을취한것이 e.target
    //   }}/> <br />

    //   {/* 주소 입력 필드 */}
    //   주소 : <input type="text" value={addr} onChange={(e) => {
    //     setAddr(e.target.value);
    //   }}/> <br />

    // {/* 사용자가 입력한 값들을 화면에 표시 */}
    // <div>
    //   입력받은 이름 : {name}
    // </div>
    // <div>
    //   입력받은 나이 : {age}
    // </div>
    // <div>
    //   입력받은 주소 : {addr}
    // </div>
    // </>


    <>
      이름 : <input name='name' type="text" value={data.name} onChange={(e) => {
        // setData({
        //   ...data, //스프레드연산자는 객체랑 배열에서 사용할수있음
        //   name : e.target.value
        // });
        changeData(e);
      }} />
      <br />

      나이 : <input name='age' type="text" value={data.age} onChange={(e) => {
        changeData(e);
      }} />
      <br />

      주소 : <input name='addr' type="text" value={data.addr} onChange={(e) => {
        changeData(e);
      }} />

      <div>
        입력받은 이름 : {data.name}
      </div>
      <div>
        입력받은 나이 : {data.age}
      </div>
      <div>
        입력받은 주소 : {data.addr}
      </div>
    </>

  )
}

export default Input_2