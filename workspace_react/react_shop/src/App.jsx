
import { Route, Routes } from 'react-router-dom'
import './App.css'
import './common.css'
import Header from './components/Header'
import ItemInsert from './components/ItemInsert'
import ItemInfo from './components/ItemInfo'
import Order from './components/Order'
import OrderList from './components/OrderList'

function App() {
  //falsy : false로 판단하는 내용
  //null, undefined, 0, ''

  //truthy :falsy한 데이터 빼고 전부.


  return (
    <div className='container'>
      <Header />

      <Routes>
        {/* 상품정보 페이지 */}
        <Route path='' element={<ItemInfo />}/>

        {/* 상품등록 */}
        <Route path='/reg-item' element={<ItemInsert />}/>

        {/* 주문하기 페이지 */}
        <Route path='/order' element={<Order />}/>

        {/* 주문목록 */}
        <Route path='/order-list' element={<OrderList />} />

      </Routes>

    </div>
  )
}

export default App
