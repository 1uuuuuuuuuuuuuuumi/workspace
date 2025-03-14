import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import { COLOR } from "../constants/colors";

const MyButton = ({ size = "normal", onPress, title = "버튼" }) => {
  return (
    // 클래스여러개사용할때의 참고용
    // <Pressable style={[styles.btnContainer, styles[size]]}>

    <Pressable
      style={(e) => {
        return [styles.btnContainer, styles[size], e.pressed && styles.pressed];
      }}
      onPress={() => {
        onPress();
      }}
    >
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  );
};

export default MyButton;

const styles = StyleSheet.create({
  btnContainer: {
    height: 30,
    borderRadius: 6,
    backgroundColor: COLOR.BTN_BACKGROUND_COLOR,
    justifyContent: "center",
    alignItems: "center",
    paddingVertical: 2, //상하
    paddingHorizontal: 4, //좌우
  },
  btn: {
    color: "#D31B33",
  },
  normal: {
    width: "30%",
  },
  large: {
    width: "100%",
  },
  pressed: {
    opacity: 0.8,
  },
});
