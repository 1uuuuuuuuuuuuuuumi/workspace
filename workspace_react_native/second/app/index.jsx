import { StatusBar, StyleSheet, Text, View } from "react-native";
import React from "react";
import { SafeAreaView } from "react-native";
import Login from "../components/Login";
import CartList from "../components/CartList";

const MainScreen = () => {
  return (
    <SafeAreaView>
      {/* 상단바 컨트롤할수있는거 */}
      <StatusBar 
        barStyle={'light-content'}
        backgroundColor={'#EDB5BD'}
        /> 
      {/* <Login /> */}
      <CartList />
    </SafeAreaView>
  );
};

export default MainScreen;

const styles = StyleSheet.create({});
