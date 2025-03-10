package com.green.basic_board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Setter
@Getter
@ToString //데이터확인을 편하게 하기 위해.
public class BoardDTO {
  private int bordNum;
  private String title;
  private String writer;
  private String content;
  private int readCnt;
  private Timestamp createDate;
}
