import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const BoardWrite = () => {
  const nav = useNavigate();

  const [writeData, setWriteData] = useState({
    title: "",
    writer: "",
    content: "",
  });

  const changeWriteData = (e) => {
    setWriteData({
      ...writeData,
      [e.target.name]: e.target.value,
    });
  };

  console.log(writeData);

  //글등록 버튼 클릭시 서버의 insert api 실행
  const insertBoard = () => {
    axios
      .post("/api/boards", writeData)
      .then((res) => {
        alert("게시글 등록 성공");
        nav("/");
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <div>
        제목 :{" "}
        <input
          type="text"
          name="title"
          value={writeData.title}
          onChange={(e) => {
            changeWriteData(e);
          }}
        />
      </div>
      <div>
        작성자 :{" "}
        <input
          type="text"
          name="writer"
          value={writeData.writer}
          onChange={(e) => {
            changeWriteData(e);
          }}
        />
      </div>
      <div>
        내용 :{" "}
        <textarea
          cols={50}
          rows={5}
          name="content"
          value={writeData.content}
          onChange={(e) => {
            changeWriteData(e);
          }}
        ></textarea>
      </div>
      <button
        type="button"
        onClick={(e) => {
          insertBoard();
        }}
      >
        글등록
      </button>
    </>
  );
};

export default BoardWrite;
