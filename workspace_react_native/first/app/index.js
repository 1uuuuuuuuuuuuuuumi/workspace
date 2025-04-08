import { StyleSheet, Text, View } from "react-native";
import React from "react";
import { Pressable } from "react-native";
import Style1 from "../components/Style1";
import Style2 from "../components/Style2";

//rnfes : 리액트네이티브방법으로 함수만들어주고,
//        expo도 넣어주고,
//        스타일시트도 할수있게 기본적인 코드도 넣어주세요 ~ 라는 의미

//View -> div
//Text -> p *주의:모든 글자는 반드시 Text 컴포넌트 안에서 작업
//버튼과 같이 터치 이벤트가 필요한 컴포넌트는 <Pressable> 컴포넌트를 사용한다.
const MainScreen = () => {
  return (
    <Style2/>
  );
};

export default MainScreen;

const styles = StyleSheet.create({});
