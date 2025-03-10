import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";

const OrderList = () => {
  //주문 목록 조회 데이터
  const [orderList, setOrderList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/orders")
      .then((res) => {
        console.log(res.data);
        setOrderList(res.data);
      })
      .catch((error) => console.log(error));
  }, []);

  return (
    <>
      <div>OrderList</div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품단가</td>
            <td>구매수량</td>
            <td>구매가격</td>
            <td>주문자</td>
            <td>주문일</td>
          </tr>
        </thead>
        <tbody>
          {orderList.map((orderInfo, i) => {
            return (
              <tr key={i}>
                <td></td>
                <td>{orderInfo.itemDTO.itemName}</td>
                <td>{orderInfo.itemDTO.itemPrice}</td>
                <td>{orderInfo.buyCnt}</td>
                <td>{orderInfo.buyPrice}</td>
                <td>{orderInfo.buyer}</td>
                <td>
                  {dayjs(orderInfo.buyDate).format("YYYY.MM.DD HH:mm:ss")}
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default OrderList;
