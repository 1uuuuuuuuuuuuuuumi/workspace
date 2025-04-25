import { Image, StyleSheet, Text, View } from "react-native";
import React from "react";
import face from "@/assets/images/face-01.jpg";
import FontAwesome6 from "@expo/vector-icons/FontAwesome6";
import {colors} from '@/constants/colorConstant'

const Profile = ({writer, createDate}) => {
  return (
    <View style={styles.container}>
      <View style={styles.profileContainer}>
        <Image source={face} style={styles.img} />
        <View style={{gap: 3}}>
          <Text style={styles.writer}>{writer}</Text>
          <Text style={styles.createDate}>{createDate}</Text>
        </View>
      </View>
      <View style={{paddingRight: 20}}>
        <FontAwesome6 name="ellipsis-vertical" size={18} color="black" />
      </View>
    </View>
  );
};

export default Profile;

const styles = StyleSheet.create({
  container: {
    flexDirection: "row",
    alignItems : "center",
    justifyContent: "space-between",
    marginBottom: 15,
  },
  img : {
    width: 50,
    height: 50,
    borderWidth : StyleSheet.hairlineWidth,
    borderRadius: 50,
    borderColor: colors.GRAY_300,
  },
  profileContainer : {
    flexDirection : 'row',
    alignItems : 'center',
    gap : 10,
  },
  writer : {
    fontSize : 15,
    fontWeight : 'bold',
  },
  createDate : {
    fontSize : 13,
    color : colors.GRAY_500,
  }
});
