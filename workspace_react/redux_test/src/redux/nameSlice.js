import { createSlice } from "@reduxjs/toolkit";
import { act } from "react";

// const [name, setName] = useState('hong');
const nameSlice = createSlice({
  name : 'name',
  initialState : {data : 'hong'},
  reducers : {
    changeName : (state, action) => {
      // return state + action.payload;
      state.data += action.payload;
    }
  }
});

export default nameSlice;