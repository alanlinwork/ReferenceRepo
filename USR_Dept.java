package com.mytest.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
}
