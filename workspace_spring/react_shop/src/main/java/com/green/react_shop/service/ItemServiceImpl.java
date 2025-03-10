package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
  private final ItemMapper itemMapper;



  @Override
  public void insertItem(ItemDTO itemDTO) {
    itemMapper.insertItem(itemDTO);
  }

  @Override
  public List<ItemDTO> selectItemList() {
    return itemMapper.selectItemList();
  }

  @Override
  public ItemDTO selectItem(int itemNum) {
    return itemMapper.selectItem(itemNum);
  }

  //상품 수정
  @Override
  public void updateItem(ItemDTO itemDTO) {
    itemMapper.updateItem(itemDTO);
  }


}
