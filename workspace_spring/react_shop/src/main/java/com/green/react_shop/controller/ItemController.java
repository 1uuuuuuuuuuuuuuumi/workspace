package com.green.react_shop.controller;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
  private final ItemService itemService;

  //상품 등록 api
  //(post) localhost:8080/items
  @PostMapping("")
  public void insertItem(@RequestBody ItemDTO itemDTO){
    itemService.insertItem(itemDTO);
  }

  //전체조회
  @GetMapping("")
  public List<ItemDTO> getList(){
    return itemService.selectItemList();
  }

  //상품 상세 조회 api
  @GetMapping("/{itemNum}")
  public ItemDTO getItem(@PathVariable("itemNum") int itemNum){
    return itemService.selectItem(itemNum);
  }

  //상품 수정 api
  //localhost:8080/items/3
  @PutMapping("")
  public void updateItem(@RequestBody ItemDTO itemDTO){
    itemService.updateItem(itemDTO);
  }


}
