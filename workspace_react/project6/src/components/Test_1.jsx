import axios from "axios";
import React, { useEffect, useState } from "react";

const Test_1 = () => {
  //모든 입력값을 저장할 state 변수
  const [orderInfo, setOrderInfo] = useState({
    food : '',
    cnt : 1,
    option : '토핑',
    request: '',
    orderDate : ''
  });
  
  console.log(orderInfo);

  //모든 입력값이 변경될때마다 실행시킬 함수
  const changeOrderInfo = (e) => {
    //orderInfo state 변수의 변경 => setOrderInfo();
    setOrderInfo({
      ...orderInfo,
      [e.target.name] : e.target.value
    });
  }

  //전송 버튼 클릭 시 서버로 데이터를 보내는 기능의 함수
  const sendData = () => {
    axios.post('/api/t9', orderInfo)
    .then((res) => {
      alert('서버로 데이터를 전송했습니다')
    })
    .catch(() => {});
  }

  return (
    <>
      <div>Test_1</div>
      <br />
      <table>
        <tbody>
          <tr>
            <td>음식 선택</td>
            <td>
              <select name="food" value={orderInfo.food} onChange={(e) => {changeOrderInfo(e)}}>
                <option value="">선택</option>
                <option value="치킨">치킨</option>
                <option value="피자">피자</option>
                <option value="족발">족발</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>수량</td>
            <td>
              <input type="number" name="cnt" value={orderInfo.cnt} 
              onChange={(e) => {changeOrderInfo(e)}} />
            </td>
          </tr>
          <tr>
            <td>추가선택</td>
            <td>
              <input type="radio" name="option" 
              value={"토핑"} checked = {orderInfo.option === '토핑'} 
              onChange={(e) => {changeOrderInfo(e)}}/>토핑추가
              <input type="radio" name="option" value={"음료"} checked={orderInfo.option === '음료'} 
              onChange={(e) => {changeOrderInfo(e)}}/>음료추가
              <input type="radio" name="option" value={"공기밥"} checked={orderInfo.option === '공기밥'} 
              onChange={(e) => {changeOrderInfo(e)}}/>공기밥추가
            </td>
          </tr>
          <tr>
            <td>요청사항</td>
            <td>
              <textarea rows={3} cols={30} name="request" value={orderInfo.request} 
              onChange={(e) => {changeOrderInfo(e)}}/>
            </td>
          </tr>
          <tr>
            <td>주문일시</td>
            <td>
              <input type="date" name="orderDate" value={orderInfo.orderDate} 
              onChange={(e) => {changeOrderInfo(e)}}/>
            </td>
          </tr>
        </tbody>
      </table>
      <br />
      <button type="button" onClick={(e) => {
        sendData();
      }}>전 송</button>
    </>
  );
};

export default Test_1;
