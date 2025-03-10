package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//xml 파일에 작성한 쿼리문을 실행시키는 메서드를 정의
//@Mapper는 생성자가 없기 때문에 객체 못만듦. MemberMapper memberMapper = new MemberMapper();
@Mapper //객체생성완료(스프링이 이 어노테이션으로 인해 알아서 만들어줌) , run돌리자마자 바로 생성됨
public interface MemberMapper { //쿼리를 실행시켜야함

  //회원 목록 조회 쿼리
  public List<MemberDTO> selectMemberList();
  // void = 쿼리결과 전체 데이터를 담아올 통
  // ()매개변수 = (xml파일)쿼리의 빈값을 채우는 역할
  // 객체 만들수있는 조건 : 1. 현재 인터페이스 파일이 기본패키지안에 있어야함
  //                    2. 객체생성 어노테이션 붙어있으면됨 (= @Mapper)

  //회원 상세 정보 조회 쿼리
  public MemberDTO findMemberByMemId(String memId);

  //회원 등록 쿼리
  public int insertMember(MemberDTO memberDTO);

  //회원 삭제 쿼리
  public void deleteMember(String memId); //매개변수 빈값채우기

  //회원 수정 쿼리
  public void updateMember(MemberDTO memberDTO);

}
