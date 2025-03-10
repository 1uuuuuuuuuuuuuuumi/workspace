package com.green.board.service;

import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //2. 컨트롤러에서 객체쓰기위해 만들어주기
public class ReplyServiceImpl implements ReplyService { //1. implements작성
  private ReplyMapper replyMapper; //3.mapper interface의 객체

  public ReplyServiceImpl (ReplyMapper replyMapper){ //4.객체생성으로 사용할꺼 들고오기
    this.replyMapper = replyMapper;
  }

  //댓글 목록 조회
  @Override
  public List<ReplyDTO> getList(int boardNum) {
    return replyMapper.getList(boardNum);
  }

  //댓글 등록
  @Override
  public void insertReply(ReplyDTO replyDTO) {
    replyMapper.insertReply(replyDTO);
  }

  //댓글 삭제
  @Override
  public void deleteReply(int replyNum) {
    replyMapper.deleteReply(replyNum);
  }
}
