package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("orders")
@Slf4j
public class OrderController {

// 1) 모든 주문정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public List<OrderDTO> getOrderList(){
    log.info(("Zoo문 목록 조호1"));
    List<OrderDTO> orderList = new ArrayList<>();
    orderList.add(new OrderDTO(1, "데님 청바지", 15000, 2, "abc"));
    orderList.add(new OrderDTO(2, "맨투맨 반팔 티셔츠", 10000, 3, "홍자바"));
    orderList.add(new OrderDTO(3, "오버핏 니트",25000, 2,"김파이"));
    orderList.add(new OrderDTO(4, "롱 패딩", 55000, 1, "zzang9"));
    orderList.add(new OrderDTO(5, "맨투맨 긴팔 티셔츠", 12000, 3, "멋진사람"));

    return orderList;
  }

// 2) 하나의 주문정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("/{itemNum}")
  public void getOrder(@PathVariable("itemNum") int itemNum){
    log.info("주문 상제 정보 조회");
    log.info("쭈문번호 : " + itemNum);
  }
// 3) 하나의 주문정보를 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void insertOrder(@RequestBody OrderDTO orderDTO){
    log.info("Zoo문을 등록ㅎH보ㅈF !!!!!");
    log.info("zOo문 호r긴 : " + orderDTO);
  }

// 4) 하나의 주문정보를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{deleteOrder}")
  public void deleteOrder(@PathVariable("deleteOrder") int deleteOrder){
    log.info("ZoO문 삭제 (하지마..구매해ㅠㅠ)");
    log.info("ZoO문 삭tothe제 : " + deleteOrder);
  }

// 5) 하나의 주문정보에서 상품명과 상품가격을 수정하는 기능을 제공하는 REST API
  @PutMapping("/{updateItem}")
  public void updateItem(@PathVariable("updateItem") int updateItem){
    log.info("수     정");
    log.info("상     품 : " + updateItem);
  }

}
