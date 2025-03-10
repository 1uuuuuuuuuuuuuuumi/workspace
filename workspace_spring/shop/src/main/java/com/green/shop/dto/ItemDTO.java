package com.green.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

//DTO 클래스는 하나의 테이블과 데이터를 주고 받기 위한 자료형

@Getter
@Setter
@ToString //기능구현아님. 단지 데이터 확인용!
public class ItemDTO {
  private int itemCode;
  private String itemName;
  private int itemPrice;
  private String itemIntro;
  private Timestamp regDate;
}
