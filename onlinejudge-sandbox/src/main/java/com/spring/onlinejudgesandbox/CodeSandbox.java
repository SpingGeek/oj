package com.spring.onlinejudgesandbox;

import com.spring.onlinejudgesandbox.model.ExecuteCodeRequest;
import com.spring.onlinejudgesandbox.model.ExecuteCodeResponse;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
