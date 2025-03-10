import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import styles from "./BoardList.module.css";
import axios from "axios";
import dayjs from "dayjs";

const BoardUpdate = () => {
  const nav = useNavigate();

  //수정할 글번호
  const { boardNum } = useParams();

  //(아래조회한) 상세정보를 저장할 state 변수
  const [boardInfo, setBoardInfo] = useState({});

  //수정할 게시글의 상세 데이터를 조회
  useEffect(() => {
    axios
      .get(`/api/boards/${boardNum}`)
      .then((res) => {
        setBoardInfo(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  console.log(boardInfo);

  //input태그에 키보드뚜드릴때마다 그거
  const changdBoardInfo = (e) => {
    setBoardInfo({
      ...boardInfo,
      [e.target.name]: e.target.value,
    });
  };

  //수정완료 버튼 클릭 시 실행
  const updateBoard = () => {
    axios
      .put(`/api/boards/${boardInfo.boardNum}`, boardInfo)
      .then((res) => {
        alert("수정 완료");
        nav(`/detail/${boardNum}`);
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div>게시글 수정 페이지</div>

      <div>
        작성일 : {dayjs(boardInfo.regDate).format("YYYY-MM-DD HH:mm:ss")}
      </div>
      <div>작성자 : {boardInfo.writer}</div>
      <div>
        제목 :{" "}
        <input
          type="text"
          name="title"
          value={boardInfo.title}
          onChange={(e) => {
            changdBoardInfo(e);
          }}
        />
      </div>
      <div>
        내용 :{" "}
        <input
          type="text"
          name="content"
          value={boardInfo.content}
          onChange={(e) => {
            changdBoardInfo(e);
          }}
        />
      </div>
      <button
        type="button"
        onClick={(e) => {
          updateBoard();
        }}
      >
        수정완료
      </button>
    </>
  );
};

export default BoardUpdate;
