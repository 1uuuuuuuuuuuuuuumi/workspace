import React from "react";

const List = () => {
  function title(e){
    
  }

  return (
    <>
      <div>
        <h3>게시글 목록</h3>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>제목</td>
              <td>작성자</td>
              <td>조회수</td>
            </tr>
          </thead>
          <tbody>
            {/* 첫번째 */}
            <tr>
              <td>{}</td>
              <td>
                <button type="button" onClick={() => {}}></button>
              </td>
              <td></td>
              <td></td>
            </tr>
            {/* 두번째 */}
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            {/* 세번째 */}
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            {/* 네번째 */}
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
          </tbody>
        </table>
      </div>
    </>
  );
};

export default List;
