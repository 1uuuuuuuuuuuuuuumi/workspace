import React, { useState } from "react";
import List from "./List";
import Detail from "./Detail";
import "./Board.css";
import "./Order.css";

const Board = () => {
  const [board, setBoard] = useState({});
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div className="container">
        <div>
          <h2>게시글 제목</h2>
        </div>
        <List setBoard={setBoard}
        setIsShow={setIsShow}/>
        {
          isShow ? <Detail board={board}/> : null
        }
      </div>
    </>
  );
};

export default Board;
