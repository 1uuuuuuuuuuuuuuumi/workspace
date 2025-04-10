import { createSlice } from "@reduxjs/toolkit";
import { jwtDecode } from "jwt-decode";

const getToken = () => {
  const token = localStorage.getItem('accessToken');

  //token 없으면 null 리턴 후 함수 종료
  if(token === null) return null;

  //token의 payload 부분을 해석해서 객체로 리턴
  const decodedToken = jwtDecode(token);

  //현재날짜및시간(현재날짜및시간을 가져오면 밀리세컨드 단위로 가져옴)
  const currentTime = Date.now() / 1000;

  //Token의 만료시간이 지났으면...
  //decodedToken.exp : 만료시간, currentTime : 현재시간
  if(decodedToken.exp < currentTime){
    return null;
  }

  return token;

}

const authSlice = createSlice({
  name : 'auth',
  initialState : {token : getToken()},
  reducers : {
    loginReducer : (state, action) => {
      state.token = action.payload;
      localStorage.setItem('accessToken', action.payload);
    },
    logoutReducer : (state) => {
      state.token = null;
      localStorage.removeItem('accessToken');
    }
  }
});

export const {loginReducer, logoutReducer} = authSlice.actions;
export default authSlice;