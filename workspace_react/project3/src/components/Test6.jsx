import React, { useState } from "react";

const Test6 = () => {
  const [count, setCount] = useState(0);

  const changeCount = (val) => {
    setCount(count + val);
  };

  return (
    <>
      <h2>Test6</h2>
      <div>
        <p>현재카운트 : </p>
        <h3>{count}</h3>
      </div>
      <div>
        <button type="button" onClick={(e) => {
          changeCount(-1);
        }}>-1</button>

        <button type="button" onClick={(e) => {
          changeCount(-10);
        }}>-10</button>
        <button type="button" onClick={(e) => {
          changeCount(-100);
        }}>-100</button>
        <button type="button" onClick={(e) => {
          changeCount(+100);
        }}>+100</button>
        <button type="button" onClick={(e) => {
          changeCount(+10);
        }}>+10</button>
        <button type="button">+1</button>
      </div>
    </>
  );
};

export default Test6;
