package com.green.shop.controller;

import com.green.shop.dto.ItemDTO;
import com.green.shop.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
  private ItemService itemService;

  public ItemController(ItemService itemService){
    this.itemService = itemService;
  }

  //상품 하나를 등록하는 기능 API
  @PostMapping("")
  public void regItem(@RequestBody ItemDTO itemDTO){
    System.out.println(itemDTO);
    //매개변수에는 ItemDTO 자료형이 들어와야 함
    //매개변수로 쿼리의 빈 값을 채워 줄 거임.

    //-> 상품명, 상품가격, 상품설명 3개 데이터가
    //들어있는 ItemDTO 객체를 매개변수로 전달해야 함.
    itemService.insertItem(itemDTO);
  }

  //2번
  @GetMapping("")
  public List<ItemDTO> selectItemList(){
    return itemService.selectItemList();
  }

  //3번
  //localhost:8080/items/3
  @GetMapping("/{itemCode}")
  public ItemDTO getItem(@PathVariable("itemCode") int itemCode){
   return itemService.selectItem(itemCode);
  }

  // localhost:8080/items/5
  @DeleteMapping("/{itemCode}")
  public void deleteItem(@PathVariable("itemCode") int itemCode){
    itemService.deleteItem(itemCode);
  }

  //수정하는기능 REST 없던 옛날버전
  // localhost:8080/items/update
  @PostMapping("/update") //post는 requestBody !
  public void updateItem(@RequestBody ItemDTO itemDTO){
    itemService.updateItem(itemDTO);
  }

  //수정하는기능 실제 REST 문법
  //(PUT) localhost:8080/items/3
  @PutMapping("/{itemCode}")
  public void updateItem2(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    itemDTO.setItemCode(itemCode); //itemDTO에 itemCode값 넣어주기
    itemService.updateItem(itemDTO);
  }

}
