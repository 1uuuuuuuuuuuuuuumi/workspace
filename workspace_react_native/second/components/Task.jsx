import {
  Image,
  Pressable,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";
import React, { useEffect, useState } from "react";
import { icon } from "../constants/icons";

const Task = ({ e, cartList, setCartList }) => {
  //수정 상태 여부
  const [isEditing, setIsEditing] = useState(false);

  //수정을 위해서는 input태그에 입력한 글자, id도 필요
  //전체 데이터도 필요

  //input태그에 입력한 데이터
  //주의! ↴
  // ↳ props로 전달된 데이터를 state 변수의 초기값으로 주면 안 됨
  const [newText, setNewText] = useState("");

  useEffect(() => {
    setNewText(e.item);
  }, [e]);

  //장바구니 목록 데이터 수정
  const handleCartList = () => {
    //상품목록에서 현재 수정 중인 상품의 id를 찾아서
    //찾은 상품의 item 속성 값을 input 태그에 입력한
    //글자로 바꿔준다.

    // 필요한데이터들
    // cartList;
    // e.id;
    // newText;
    // setCartList();

    // ----- 1번 풀이 -----//
    // const copyCartList = [...cartList];
    // for(const cart of copyCartList){
    //   if(cart.id === e.id){
    //     cart.item = newText;
    //   }
    // }
    // // setCartList(cartList); X
    // // setCartList([...cartList]);
    // setCartList(copyCartList);
    // ----- 1번 풀이 끝!! -----//

    // ----- 2번 풀이 -----//
    //find : 조건과 일치하는 데이터만 리턴한다.
    //filter : 조건과 일치하는 데이터만 필터링한다.(제외한다)
    const copyCartList = [...cartList];
    const findCart = copyCartList.find((cart) => {
      return cart.id === e.id;
    });
    findCart.item = newText;
    setCartList(copyCartList);
    // ----- 2번 풀이 끝!! -----//
  };

  return (
    <View style={styles.container}>
      {isEditing ? (
        <>
          <TextInput
            style={styles.input}
            autoFocus={true}
            //포커스아웃 이벤트
            //input태그 활성화된 상태에서 다른곳을 터치한 순간.
            onBlur={() => {
              setIsEditing(false);
              setNewText(e.item);
            }}
            onChangeText={(text) => setNewText(text)}
            value={newText}
            onSubmitEditing={() => {
              handleCartList();
            }}
          />
        </>
      ) : (
        <>
          <Pressable
            onPress={() => {
              setIsEditing(true);
            }}
          >
            <Image source={icon.ICON_EDIT} />
          </Pressable>

          <Text style={styles.title}>{e.item}</Text>
          <Image source={icon.ICON_DELETE} style={styles.img} />
        </>
      )}
    </View>
  );
};

export default Task;

const styles = StyleSheet.create({
  container: {
    borderWidth: 1,
    margin: 12,
    backgroundColor: "#FDF06F",
    borderRadius: 5,
    flexDirection: "row",
    alignItems: "center",
    padding: 10,
    gap: 8,
  },
  title: {
    flex: 1,
    fontSize: 18,
  },
  img: {
    width: 20,
    height: 20,
  },
  input: {
    borderWidth: 1,
    width: "100%",
  },
});
