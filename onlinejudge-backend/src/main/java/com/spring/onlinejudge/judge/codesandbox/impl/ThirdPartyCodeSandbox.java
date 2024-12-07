package com.spring.onlinejudge.judge.codesandbox.impl;

import com.spring.onlinejudge.judge.codesandbox.CodeSandbox;
import com.spring.onlinejudge.judge.codesandbox.model.ExecuteCodeRequest;
import com.spring.onlinejudge.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
