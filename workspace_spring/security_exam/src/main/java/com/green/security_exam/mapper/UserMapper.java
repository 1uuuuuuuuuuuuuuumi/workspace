package com.green.security_exam.mapper;

import com.green.security_exam.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  //회원가입
  public void join(MemberDTO memberDTO);
}
