package com.green.shop.service;

import com.green.shop.dto.ItemDTO;

import java.util.List;

//핵심 기능을 정의한 인터페이스
//핵심 기능 : 쿼리 작업
public interface ItemService {
  //상품 등록 기능 메서드
  public int insertItem(ItemDTO itemDTO);

  //상품 목록 조회 기능 실행 메서드
  public List<ItemDTO> selectItemList();

  //상품 하나 조회 기능
  public ItemDTO selectItem(int itemCode);

  //상품을 삭제하는 기능 실행 메서드
  public void deleteItem(int itemCode);

  //업데이트 기능 실행 메서드
  public void updateItem(ItemDTO itemDTO);

}
