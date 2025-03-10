package com.green.book_shop.book.service;

import com.green.book_shop.book.dto.BookCategoryDTO;
import com.green.book_shop.book.dto.BookDTO;

import java.util.List;

public interface BookService {
  // 카테고리 목록 조회
  public List<BookCategoryDTO> selectCategoryList();

  // 도서 등록
  public void insertBook(BookDTO bookDTO);

  // 3-1, 2 카테고리 등록 기능
  // ("카테고리명 중복 확인 쿼리"에서 넘어옴)
  public int insertCategory(String cateName);

}
