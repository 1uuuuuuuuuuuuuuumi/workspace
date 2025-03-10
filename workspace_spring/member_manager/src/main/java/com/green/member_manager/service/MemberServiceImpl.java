package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 자바클래스객체생성문법 : MemberServiceImpl aa = new MemberServiceImpl();
// "aa" 의 객체명은 "@Service"로 인해 스프링이 알아서 만들어주는데 클래스명의 앞글자만 소문자로 만들어줌
@Service // @Service("aaa") => 객체명 지정가능 | 객체를 만들어주는데 객체명을 괄호에 적은대로 만들어준것
public class MemberServiceImpl implements MemberService { //1. implements MemberService 클래스명뒤에 적기
//2. 빨간오류줄 마우스올려서 클릭
  private MemberMapper memberMapper; //3. mapper파일에서 어노테이션으로 객체 생성후 객체 생성함

  public MemberServiceImpl(MemberMapper memberMapper){  //4. 위에 만든걸로 생성자 만듦
    this.memberMapper = memberMapper;
  }

  //회원 목록 조회 기능(을 만들었음 -컨트롤러입장)
  @Override
  public List<MemberDTO> selectMemberList() {
    //객체명.메서드명();
    //memberMapper.selectMemberList(); 회원 목록 조회 쿼리 실행 (조회를 하세요~ 하는기능임, 실행하세요~ 기능은 return)
    return memberMapper.selectMemberList(); //mapper파일의 "public List<MemberDTO> selectMemberList();" 이 메서드를 사용해야 함
    //return은 (데이터) 담는것. 쿼리를 실행시키면 조회된게 왕창나오고 왕창나온걸 리턴시켜서 쓰는것.

  }

  //회원 상세 정보 조회 기능
  @Override
  public MemberDTO findMemberByMemId(String memId) {
    return memberMapper.findMemberByMemId(memId);
  }

  //회원 등록 기능
  @Override
  public int insertMember(MemberDTO memberDTO) {
    return memberMapper.insertMember(memberDTO);
  }

  //회원 삭제 기능
  @Override
  public void deleteMember(String memId) {
    memberMapper.deleteMember(memId);
  }

  //회원 정보 수정 기능
  @Override
  public void updateMember(MemberDTO memberDTO) {
    memberMapper.updateMember(memberDTO);
  }

}
