package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

  //게시글 목록 조회 쿼리
  public List<BoardDTO> selectBoardList(SearchDTO searchDTO);

  //게시글 등록 쿼리
  public void insertBoard(BoardDTO boardDTO);

  //게시글 상세 조회 쿼리
  public BoardDTO selectBoard(int boardNum);

  //게시글 삭제 쿼리
  public void deleteBoard(int boardNum);

  //게시글 수정 쿼리
  public void updateBoard(BoardDTO boardDTO);

  //조회수 증가 쿼리
  public void updateReadCnt(int boardNum);

}
