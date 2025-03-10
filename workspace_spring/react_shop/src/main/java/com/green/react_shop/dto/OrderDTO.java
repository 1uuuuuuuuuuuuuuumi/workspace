package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int orderNum;
  private int itemNum;
  private String buyer;
  private  int buyCnt;
  private int buyPrice;
  private LocalDateTime buyDate;

  private int price; //리액트에서 여기로 넘어올때 Order.jsx참고

//  ===JOIN==========================================

  private ItemDTO itemDTO;
}
