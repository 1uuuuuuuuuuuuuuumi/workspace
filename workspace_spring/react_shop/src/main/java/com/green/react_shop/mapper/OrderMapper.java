package com.green.react_shop.mapper;

import com.green.react_shop.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
  //주문 등록
  public void insertOrder(OrderDTO orderDTO);
  public List<OrderDTO> selectOrderList();
}
