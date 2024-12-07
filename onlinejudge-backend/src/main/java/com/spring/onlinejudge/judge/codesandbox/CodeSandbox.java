package com.spring.onlinejudge.judge.codesandbox;

import com.spring.onlinejudge.judge.codesandbox.model.ExecuteCodeRequest;
import com.spring.onlinejudge.judge.codesandbox.model.ExecuteCodeResponse;

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
