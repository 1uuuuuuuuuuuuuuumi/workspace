package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;

import java.util.List;

public interface OrderService {
  //주문 등록
  public void insertOrder(OrderDTO orderDTO);
  public List<OrderDTO> selectOrderList();
}
