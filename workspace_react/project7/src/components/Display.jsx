import React, { useState } from "react";

export const Display = (props) => {
  console.log(props);

  return (
    <>
      <div>
      <p>현재 카운트 : </p>
      <h2>{props.cnt}</h2>
      </div>
    </>
  );
};
