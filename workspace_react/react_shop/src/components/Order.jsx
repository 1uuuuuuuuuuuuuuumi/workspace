import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const Order = () => {
  const nav = useNavigate();

  //조회한 상품 목록을 저장할 변수
  const [itemList, setItemList] = useState([]);
  console.log(itemList);

  //입력한 정보를 저장하는 변수
  const [orderData, setOrderData] = useState({
    itemNum: "",
    price: "상품을 선택하세요",
    buyer: "",
    buyCnt: 1,
  });

  console.log(orderData);

  //상품 목록 조회
  useEffect(() => {
    axios
      .get("/api/items")
      .then((res) => {
        setItemList(res.data);
      })
      .catch((error) => console.log(error));
  }, []);

  const changeOrderData = (e) => {
    if (e.target.name === "itemNum") {
      let itemPrice = 0;

      for (const item of itemList) {
        if (item.itemNum == e.target.value) {
          itemPrice = item.itemPrice;
        }

        setOrderData({
          ...orderData,
          [e.target.name]: e.target.value,
          price: itemPrice,
        });
      }
    } else {
      setOrderData({
        ...orderData,
        [e.target.name]: e.target.value,
      });
    }
  };

  const insertOrder = () => {
    axios
      .post("/api/orders", orderData)
      .then((res) => {
        alert("★주문완료★");
        nav("/order-list");
      })
      .catch((error) => console.log(error));
  };

  return (
    <div>
      <div>Order</div>
      <div>
        주문상품
        <select
          name="itemNum"
          value={orderData.itemNum}
          onChange={(e) => {
            changeOrderData(e);
          }}
        >
          <option value="">선택</option>
          {itemList.map((item, i) => {
            return (
              <option key={i} value={item.itemNum}>
                {item.itemName}
              </option>
            );
          })}
        </select>
      </div>
      <div>
        상품단가 :
        <input
          type="text"
          name="price"
          value={orderData.price}
          onChange={(e) => changeOrderData(e)}
          readOnly={true}
        />
      </div>
      <div>
        주문자 :
        <input
          type="text"
          name="buyer"
          value={orderData.buyer}
          onChange={(e) => changeOrderData(e)}
        />
      </div>
      <div>
        주문 수량 :
        <input
          type="text"
          name="buyCnt"
          value={orderData.buyCnt}
          onChange={(e) => changeOrderData(e)}
        />
      </div>
      <button
        className="btn btn-large"
        type="button"
        onClick={() => {
          insertOrder();
        }}
      >
        주문하기
      </button>
    </div>
  );
};

export default Order;
