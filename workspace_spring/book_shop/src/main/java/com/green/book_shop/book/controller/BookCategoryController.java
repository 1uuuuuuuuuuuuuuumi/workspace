package com.green.book_shop.book.controller;

import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class BookCategoryController {
  private final BookService bookService;

  // 카테고리 목록 조회 api
  // ~/categories
  @GetMapping("")
  public List<BookCategoryDTO> getCateList(){
    return bookService.selectCategoryList();
  }

  // 카테고리 등록 api
  // post ~/categories
  @PostMapping("")
  public int insertCategory(@RequestBody BookCategoryDTO bookCategoryDTO){
    //@RequestBody 넘어오는 객체의 키와 매개변수에 작성한 dto 클래스의 변수가 일치
    //등록 성공 ➔ 1 리턴
    //등록 안했으면 ➔ 0 리턴
    return bookService.insertCategory(bookCategoryDTO.getCateName());
  }

}
