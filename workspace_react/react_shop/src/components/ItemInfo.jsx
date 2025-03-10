import React, { useEffect, useState } from "react";
import styles from "./ItemInfo.module.css";
import axios from "axios";
import { useParams } from "react-router-dom";
import dayjs from "dayjs";
import ItemDetail from "./ItemDetail";

const ItemInfo = () => {
  //조회한 상품 목록 데이터를 저장할 state 변수
  const [itemList, setItemList] = useState([]);

  //상세 정보 조회 데이터를 저장할 state 변수
  const [itemDetail, setItemDetail] = useState(null);

  //아무의미없음.값만바꿀변수(useEffect의 의존성배열)
  const [cnt, setCnt] = useState(0);

  //상세 정보 내용 보이기/안보이기 변수
  //const [isShow, setIsShow] = useState(false);

  useEffect(() => {
    axios
      .get("/api/items")
      .then((res) => setItemList(res.data))
      .catch((error) => console.log(error));
  }, [cnt]);

  //상품명 클릭 시 상세 정보 조회 함수
  const getDetail = (itemNum) => {
    axios
      .get(`/api/items/${itemNum}`)
      .then((res) => {
        setItemDetail(res.data);
        //setIsShow(true);
      })
      .catch((error) => console.log(error));
  };

  return (
    <div className={styles.item_info_container}>
      <div className={styles.list_div}>
        <h3>상품 목록</h3>
        <table className={styles.list_table}>
          <colgroup>
            <col width={""} />
            <col width={""} />
            <col width={""} />
            <col width={""} />
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>상품가격</td>
              <td>판매자</td>
            </tr>
          </thead>
          <tbody>
            {itemList.map((item, i) => {
              return (
                <tr key={i}>
                  <td>{itemList.length - i}</td>
                  <td>
                    <span onClick={(e) => getDetail(item.itemNum)}>
                      {item.itemName}
                    </span>
                  </td>
                  <td>\{item.itemPrice.toLocaleString()}</td>
                  <td>{item.seller}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
        <p>
          총 <span className="">{itemList.length}개</span>의 상품이
          등록되었습니다.
        </p>
      </div>

      <div className={styles.detail_div}>
        {
          //isShow ? <ItemDetail itemDetail={itemDetail} /> : null
          itemDetail && (
            <ItemDetail
              itemDetail={itemDetail}
              setItemDetail={setItemDetail}
              setCnt={setCnt}
              cnt={cnt}
            />
          )
        }
      </div>
    </div>
  );
};

export default ItemInfo;
