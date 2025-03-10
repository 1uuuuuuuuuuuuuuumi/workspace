import React, { useState } from "react";

const OrderDetail = ({order}) => {
  

  return (
    <>
      <h2>주문 상세 정보</h2>
      <table className="detail-table">
        <colgroup>
          <col width={'25%'}/>
          <col width={'25%'}/>
          <col width={'25%'}/>
          <col width={'25%'}/>
        </colgroup>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>{order.itemNum}</td>
            <td>상품명</td>
            <td>{order.itemName}</td>
          </tr>
          <tr>
            <td>가격</td>
            <td>{order.itemPrice}원</td>
            <td>수량</td>
            <td>{order.itemCnt}</td>
          </tr>
          <tr>
            <td>주문자ID</td>
            <td>{order.memId}</td>
            <td>구매금액</td>
            <td>{order.itemPrice * order.itemCnt}원</td>
          </tr>
        </tbody>
      </table>
    </>
  );
};

export default OrderDetail;
