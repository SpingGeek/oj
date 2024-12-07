package com.spring.onlinejudgesandbox.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 执行代码请求
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExecuteCodeRequest {

    private List<String> inputList;
    private String language;
    private String code;


}
