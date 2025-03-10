package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.dto.TestDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   //1번
@RequestMapping("/replies")    //2. @RequestMapping는 중복되면 안됨(ex./boards)
public class ReplyController {
  private ReplyService replyService;    //5번

  public ReplyController(ReplyService replyService){    //6번
    this.replyService = replyService;
  }

  //댓글 목록 조회 api    //3. 메서드만들기
  //(get) localhost:8080/replies/3 게시글넘버가 넘어와야함 boardNum !
  @GetMapping("/{boardNum}")    //3.@GetMapping
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum){   //4.@PathVariable
    return replyService.getList(boardNum);    //@PathVariable로 가져온 매개변수 채워넣기
  }

  //댓글 등록 api
  //(post) localhost:8080/replies → URL Parameter 방식
  //(post) localhost:8080/replies?boardNum=3  →  Query String 방식
  @PostMapping("")
  public void insertReply(@RequestBody ReplyDTO replyDTO){
    replyService.insertReply(replyDTO);
  }

//  [ 1. 데이터를 "@RequestParam" 으로 받기 ]
//  @GetMapping("/test")
//  public void test(@RequestParam("age") int age, @RequestParam("name") String name){
//    System.out.println("age = " + age);
//    System.out.println("name = " + name);
//  }

  //  [ 2. 데이터를 "DTO" 클래스로 받기 ]
  @GetMapping("/test")
  public void test(TestDTO testDTO){  //어노테이션 1도 필요없음 바로받아버림
    System.out.println(testDTO);
  }

  //댓글 삭제 api
  //localhost:8080/replies/3
  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum") int replyNum){
    replyService.deleteReply(replyNum);
  }
}
