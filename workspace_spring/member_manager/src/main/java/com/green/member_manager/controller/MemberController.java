package com.green.member_manager.controller;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import com.green.member_manager.service.MemberService;
import com.green.member_manager.service.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@Slf4j //log.info();로 출력문 가능
@RestController
@RequestMapping("/members")
public class MemberController { //MemberServiceImpl에서 한걸 사용하는곳
  private MemberService memberService;  // 1.객체 만들기 MemberServiceImpl에서 @Service적기

  public MemberController(MemberService memberService){   //2.객체생성
    this.memberService = memberService;
  }

  //회원 목록 조회 rest api (말이 어렵지 메서드 만드는 것!)
  @GetMapping("") //조회할거니까 GetMapping!
  public List<MemberDTO> getMemberList(){ // public List<MemberDTO> selectMemberList() {}
                                          // MemberServiceImpl의 기능에 적혀있는대로 자료형적어야함
    log.info("회원 목록 조회 시작~"); //이 메서드가 호출이 되면 출력 됨

    //3.객체 만들었으면 객체명.쓰고싶은메서드(); !
    //회원 목록 조회
    return memberService.selectMemberList(); //회원목록을 조회하고 리턴해주는데 다시 리턴해준다.
    //컨트롤러에서 리턴하는건 포스트맨이라면 포스트맨으로 리턴시켜주고 리액트라면 리액트로 리턴시켜준다.
  }


  //회원 상세 정보 조회 rest api
  //(Get) localhost:8080/members/java
  @GetMapping("/{memId}")
  public MemberDTO getMember(@PathVariable("memId") String memId){
    return memberService.findMemberByMemId(memId);
  }

  //회원 등록 rest api
  //localhost:8080/members
  @PostMapping("")
  public int regMember(@RequestBody MemberDTO memberDTO){
    return memberService.insertMember(memberDTO);
  }

  //회원 삭제 api
  // localhost:8080/members/java
  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    memberService.deleteMember(memId);
  }

  //회원 정보 수정 api
  //(PUT) localhost:8080/members/java
  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    memberDTO.setMemId(memId);
    memberService.updateMember(memberDTO);
  }

}
