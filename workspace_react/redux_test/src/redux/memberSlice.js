import { createSlice } from "@reduxjs/toolkit";

const memberSlice = createSlice({
  name : 'member',
  initialState : {
    memId : 'hong',
    memAge : 20
  },
  reducers : {
    handleMemberId : (state, action) => {
      // return {...state, memId : 'java'}
      state.memId = action.payload; //state의 값을 직접 변경 해도 됨. (immer 라이브러리 사용) ★리덕스에서는 가능★
    }
  }
});

export const {handleMemberId} = memberSlice.actions;
export default memberSlice;