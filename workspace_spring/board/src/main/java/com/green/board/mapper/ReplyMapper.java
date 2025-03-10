package com.green.board.mapper;

import com.green.board.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper   //1.쿼리실행할것을 알려줘야하니까
         // 2.xml네임스페이스로 가서 현파일 연결시켜주기
public interface ReplyMapper {
  //댓글 목록 조회 쿼리
  public List<ReplyDTO> getList(int boardNum); //3.쿼리보고 작성하기

  //댓글 등록 쿼리
  public void insertReply(ReplyDTO replyDTO);

  //댓글 삭제 쿼리
  public void deleteReply(int replyNum);
}
