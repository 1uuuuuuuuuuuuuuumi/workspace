package com.green.security_exam.service;

import com.green.security_exam.dto.MemberDTO;
import com.green.security_exam.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
  private final UserMapper userMapper;

  //회원가입
  @Override
  public void join(MemberDTO memberDTO) {
    userMapper.join(memberDTO);
  }

  //<!--로그인하려는 회원 정보 조회-->
  @Override
  public MemberDTO getMemberForLogin(String memEmail) {
    return userMapper.getMemberForLogin(memEmail);
  }
}
