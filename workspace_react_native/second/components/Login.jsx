import { StyleSheet, Text, TextInput, View } from "react-native";
import React, { useState } from "react";
import MyTextInput from "./MyTextInput";
import MyButton from "./MyButton";

const Login = () => {
  const [data, setData] = useState({
    id: "",
    pw: "",
  });

  const changeData = (text, name) => {
    setData({
      ...data,
      [name]: text,
      //java를 입력했다면 -> ['id'] : 'java'
    });
  };

  // const [id, setId] = useState('');
  // const [pw, setPw] = useState('');

  const printHello = () => {
    console.log("안녕하세요");
  };

  return (
    <View>
      <Text style={styles.text}>Login</Text>

      <TextInput
        onChangeText={(text) => changeData(text, "id")}
        value={data.id}
        // value={id}
      />
      <TextInput
        onChangeText={(text) => changeData(text, "pw")}
        value={data.pw}
        // value={pw}
      />

      <MyTextInput
        placeholder={"aaa"}
        onChangeText={(text) => changeData(text, "id")}
        value={data.id}
      />
      <MyTextInput
        placeholder={"bbb"}
        onChangeText={(text) => changeData(text, "pw")}
        value={data.pw}
      />

      {/* alert으로 안녕하세요 */}
      {/* 첫번째 방식 */}
      <MyButton
        onPress={() => {
          alert("안녕하세요");
        }}
      />

      {/* console에 안녕하세요 */}
      {/* 두번째 방식 - 함수(printHello) */}
      <MyButton
        size="large"
        onPress={() => {
          printHello();
        }}
      />

      <MyButton
        title="데이터확인"
        onPress={() => {
          alert(`id = ${data.id}, pw = ${data.pw}`);
        }}
      />
    </View>
  );
};

export default Login;

const styles = StyleSheet.create({
  text: {
    color: "#D31B33",
    fontSize: 50,
  },
});
