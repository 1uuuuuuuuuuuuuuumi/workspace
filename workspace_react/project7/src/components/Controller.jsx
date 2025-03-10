import React, { useState } from "react";

const Controller = (props) => {

  return (
    <>
    <div>
      <button type="button" onClick={(e)=>{
        props.setCnt(props.cnt - 1);
      }}>-1</button>
      <button type="button" onClick={(e)=>{
        props.setCnt(props.cnt - 10);
      }}>-10</button>
      <button type="button" onClick={(e)=>{
      props.setCnt(props.cnt - 100);
      }}>-100</button>
      <button type="button" onClick={(e)=>{
      props.setCnt(props.cnt + 100);
      }}>+100</button>
      <button type="button" onClick={(e)=>{
      props.setCnt(props.cnt + 10);
      }}>+10</button>
      <button type="button" onClick={(e)=>{
      props.setCnt(props.cnt + 1);
      }}>+1</button>
    </div>
    </>
  );
};

export default Controller;
