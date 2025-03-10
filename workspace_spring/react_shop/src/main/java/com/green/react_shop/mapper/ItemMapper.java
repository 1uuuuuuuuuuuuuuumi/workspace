package com.green.react_shop.mapper;

import com.green.react_shop.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
  //상품 등록 쿼리
  public void insertItem(ItemDTO itemDTO);

  //상품 목록 조회 쿼리
  public List<ItemDTO> selectItemList();

  //상품 상세 조회
  public ItemDTO selectItem(int itemNum);

  //상품 수정 쿼리
  public void updateItem(ItemDTO itemDTO);
}
