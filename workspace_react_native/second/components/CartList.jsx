import {
  Image,
  Pressable,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";
import React, { useState } from "react";
import { icon } from "../constants/icons";
import { data } from "../data/data";
import Task from "./Task";

//
const CartList = () => {
  // console.log(Math.max(1, 5, 3));

  const [cartList, setCartList] = useState(data);
  const [newItem, setNewItem] = useState("");

  //max값 구하는 방법
  //첫번째 방법
  // const a = cartList.map((e, i) => {return e.id}); //[1, 2, 3]
  // const end = Math.max(...a) + 1;
  //두번째 방법
  // const end = Math.max(...cartList.map((e, i) => {return e.id})) + 1;

  return (
    <View>
      <Text style={styles.cartList}>CartList</Text>
      {/* <Image source={icon_edit} />
      <Image source={icon_delete} />
      <Image source={icon.ICON_EDIT} /> */}

      {cartList.map((e, i) => {
        return (
          <Task 
            key={i} 
            e={e} 
            cartList={cartList} 
            setCartList={setCartList} />
        );
      })}

      <View>
        <TextInput
          style={styles.input}
          value={newItem}
          onChangeText={(text) => setNewItem(text)}
          //키보드의 완료, enter 키를 눌렀을 때 실행하는 이벤트
          onSubmitEditing={() => {
            //max id + 1 구하기
            let max = cartList[0].id;
            for (const e of cartList) {
              if (max < e.id) {
                max = e.id;
              }
            }

            //max값 구하는 방법 (13번줄 참고)
            const max1 = Math.max(
              ...cartList.map((e, i) => {
                return e.id;
              })
            );

            //저장할 객체를 생성
            const newData = {
              id: max + 1,
              item: newItem,
            };
            //cartList에 저장
            setCartList([...cartList, newData]);
            setNewItem("");
          }}
        />
      </View>
    </View>
  );
};

export default CartList;

const styles = StyleSheet.create({
  input: {
    borderWidth: 1
  }
});
