package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@Slf4j
public class ItemController {
  //1. 모든 상품을 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public void getItemList(){
    log.info("모든상품조호1");
  }

  //2. 상품 하나를 조회하는 기능을 제공하는 REST API
  @GetMapping("/{itemCode}")
  public void getItem(@PathVariable("itemCode") int code){
    log.info("상품 ㅎㅏㄴㅏ를 조 호1");
    log.info("CODE : " + code);
  }

  //3. 상품 하나를 등록하는 기능을 제공하는 REST API
    @PostMapping("/{itemCode}")
    public void insertItem(@PathVariable("itemCode") int insertItem){
    log.info("상품하나등록!!!");
    log.info("ㅇrㅇㅣ템 : " + insertItem);
  }

  //4. 상품 하나를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{deleteItem}")
  public void deleteItem(@PathVariable("deleteItem") int deleteItem){
    log.info("상품하나삭제ㅔㅔㅔㅔㅔ");
    log.info("DELETE!!!!! : " + deleteItem);
  }

  //5. 상품 하나의 상품명과 가격, 색상을 변경하는 기능 제공 REST API
  @PutMapping("{/updateItem}")
  public void updateItem(@PathVariable("updateItem") int updateItem, @RequestBody
  ItemDTO itemDTO){
    log.info("수 정 ~~~~~~~~~~~~~~~~");
    log.info("상품하나의 이름 : " + updateItem);
    log.info(itemDTO.toString());
  }

}
