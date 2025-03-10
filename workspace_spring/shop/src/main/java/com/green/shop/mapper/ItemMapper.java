package com.green.shop.mapper;

import com.green.shop.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper => 객체 생성 + 해당 파일에 쿼리를 실행시킬 메서드가 정의되어있다는 것을 인지시켜줌

//메소드의 리턴타입 : 쿼리 실행 결과를 가져올 자료형
@Mapper
public interface ItemMapper {
  public int insertItem(ItemDTO itemDTO);

  //상품 목록 조회 쿼리 실행 메서드
  public List<ItemDTO> selectItemList();

  //상품 하나 조회 쿼리
  public ItemDTO selectItem(int itemCode);

  //상품을 삭제하는 쿼리 실행 메서드
  public void deleteItem(int itemCode);

  //업데이트 쿼리 실행 메서드
  public void updateItem(ItemDTO itemDTO);

}
