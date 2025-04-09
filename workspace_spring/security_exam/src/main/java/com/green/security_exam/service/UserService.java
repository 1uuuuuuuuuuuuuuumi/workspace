package com.green.security_exam.service;

import com.green.security_exam.dto.MemberDTO;

public interface UserService {
  //회원가입
  public void join(MemberDTO memberDTO);

  //  <!--로그인하려는 회원 정보 조회-->
  public MemberDTO getMemberForLogin(String memEmail);
}
