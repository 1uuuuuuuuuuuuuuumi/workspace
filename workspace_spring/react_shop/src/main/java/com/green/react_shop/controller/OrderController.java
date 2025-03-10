package com.green.react_shop.controller;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.OrderService;
import com.green.react_shop.service.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
  private final OrderService orderService;

  //주문 등록
  @PostMapping("")
  public void insertOrder(@RequestBody OrderDTO orderDTO){
    orderService.insertOrder(orderDTO);
  }

  //주문 목록 조회
  @GetMapping("")
  public List<OrderDTO> getList(){
    return orderService.selectOrderList();
  }
}
