package com.green.shop.service;

import com.green.shop.dto.ItemDTO;
import com.green.shop.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//핵심 기능 구현
//핵심 기능은 쿼리 실행이라고 생각하면 된다.
// -> 쿼리 실행을 위해서는 ItemMapper 인터페이스의 객체가 있어야 한다.
@Service
public class ItemServiceImpl implements ItemService {
  private ItemMapper itemMapper;

//  @Autowired 생략
  public ItemServiceImpl(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }

  //상품 등록 기능 메서드
  @Override
  public int insertItem(ItemDTO itemDTO) {
    System.out.println("상품의 재고를 확인한다");
    System.out.println("상품에 이상이 없는지 확인한다");
    //상품을 등록한다. -> 쿼리 실행
    int result = itemMapper.insertItem(itemDTO);
    System.out.println("잘 등록됐는지 확인한다");
    return result;
  }

  //2번
  //상품 목록 조회 기능 실행 메서드
  @Override
  public List<ItemDTO> selectItemList() {
    return itemMapper.selectItemList();
  }

  //3번
  //상품 하나 조회 기능
  @Override
  public ItemDTO selectItem(int itemCode) {
    return itemMapper.selectItem(itemCode);
  }

  //상품을 삭제하는 기능 실행 메서드
  @Override
  public void deleteItem(int itemCode) {
    itemMapper.deleteItem(itemCode);
  }

  //업데이트 기능 실행 메서드
  @Override
  public void updateItem(ItemDTO itemDTO) {
    itemMapper.updateItem(itemDTO);
  }

}
