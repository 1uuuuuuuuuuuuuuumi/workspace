import axios from "axios";
import React, { useEffect, useState } from "react";

const OrderList = ({ setOrder, setIsShow }) => {
  const [orderList, setOrderList] = useState([]);

  useEffect(() => {
    axios
      .get("/api/orders")
      .then((res) => {
        console.log(res.data);
        setOrderList(res.data);
      })
      .catch((error) => {
        console.log("통신이 실패ㅐㅐㅐ");
        console.log(error);
      });
  }, []);

  return (
    <>
      <h2>주문목록</h2>
      <table className="list-table">
        <colgroup>
          <col width={"10%"} />
          <col width={"*"} />
          <col width={"15%"} />
          <col width={"15%"} />
          <col width={"15%"} />
        </colgroup>
        <thead className="list-thead">
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매가격</td>
          </tr>
        </thead>
        <tbody>
          {orderList.map((order, i) => {
            return (
              <tr
                key={i}
                onClick={(e) => {
                  for (let i = 0; i < orderList.length; i++) {
                    if (orderList[i].itemNum == order.itemNum)
                      setOrder(orderList[i]);
                  }
                  setIsShow(true);
                }}
              >
                <td>{orderList.length - i}</td>
                <td>{order.itemName}</td>
                <td>{order.itemPrice}원</td>
                <td>{order.itemCnt}</td>
                <td>{order.itemPrice * order.itemCnt}원</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default OrderList;
