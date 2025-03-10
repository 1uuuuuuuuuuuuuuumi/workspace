package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  //생성자 주입 방식
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 목록 조회 api
  //(get) ~/boards
  @GetMapping("")
  public List<BoardDTO> getList(SearchDTO searchDTO){
    System.out.println(searchDTO);
    return boardService.selectBoardList(searchDTO);
  }

  //게시글 등록 api
  //(post) ~/boards
  @PostMapping("")
  public void insert(@RequestBody BoardDTO boardDTO){ //매개변수는 빈값채우기 => 쿼리보고판단
    boardService.insertBoard(boardDTO);
  }

  //게시글 상세 조회 api
  //(get) ~/boards/1
  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    return boardService.selectBoard(boardNum);
  }

  //게시글 삭제 api
  //(delete) ~/boards/1
  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }

  //게시글 수정 api
  //(put) localhost:8080/boards/3
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    //현재 api가 실행되면 쿼리의 빈값을채워줘야한다.
    //boardNum값은 rest문법에 맞춰야하니까 url로 가져오게한다
    //쿼리실행할때 패스베리어블에 들어가있다, 나머지 타이틀,컨텐트는 보드dto로 담아옴
    //boardNum데이터는 안들어있음.
    //이상태로 실행을 시키면 쿼리에 boardDTO만 빈값을 채우는중임.
    //boardNum은 빈값을 못채움.
    //그래서 아래의 코드가 필요한 것 (boardDTO라는 객체에 boardNum값을 채워주고있는것)
    //(패스베리어블에 실제 boardNum값이 있으니 BoardDTO에 추가하는것)
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

}
