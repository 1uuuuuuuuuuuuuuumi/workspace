import React, { useState } from "react";
import OrderList from "./OrderList";
import OrderDetail from "./OrderDetail";

const OrderInfo = () => {
  const [order, setOrder] = useState({});
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div className="container">
        <OrderList setOrder={setOrder}
        setIsShow={setIsShow} />
        {
        isShow ? <OrderDetail order={order} /> : null
        }
      </div>
    </>
  );
};

export default OrderInfo;
