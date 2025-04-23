import { StyleSheet, Text, TextInput, View } from 'react-native'
import React from 'react'
import { colors } from '../../constants/colorConstant'

const CustomInput = ({lable, isPw=false, ...props}) => {
  return (
    <View>
      {
        lable && <Text style={styles.lable}>{lable}</Text>
      }
      <View style={styles.container}>
        <TextInput style={styles.input} 
          secureTextEntry={isPw}
          {...props}
        />
      </View>
    </View>
  
  )
}

export default CustomInput

const styles = StyleSheet.create({
  lable : {
    fontSize : 12,
    marginBottom : 6,
    color : colors.GRAY_500
  },
  container : {
    height : 44,
    borderRadius : 8,
    paddingHorizontal : 10,
    justifyContent : 'center',
    backgroundColor : colors.GRAY_100,
    borderColor : colors.ORANGE_600,
    borderWidth : 1,
  },
  input : {
    fontSize : 16,
    flex : 1,
  }
})