package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {

  //상품 등록 기능
  public void insertItem(ItemDTO itemDTO);

  //상품 목록 조회 기능
  public List<ItemDTO> selectItemList();

  //상품 상세 조회
  public ItemDTO selectItem(int itemNum);

  //상품 수정 기능
  public void updateItem(ItemDTO itemDTO);
}
