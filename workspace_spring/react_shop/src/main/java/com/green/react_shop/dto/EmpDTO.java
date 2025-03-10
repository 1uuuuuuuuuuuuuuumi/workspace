package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class EmpDTO {
  private int empno;
  private String ename;
  private String job;
  private int mgr;
  private LocalDateTime hiredate;
  private int sal;
  private int comm;
  private int deptno;

  private DeptDTO deptDTO;
  // ↪ "사원은 하나의 부서정보를 가진다"를 그대로 녹여냈음.
}
