package com.spring.onlinejudge.judge.codesandbox;

import com.spring.onlinejudge.judge.codesandbox.impl.ExampleCodeSandbox;
import com.spring.onlinejudge.judge.codesandbox.impl.RemoteCodeSandbox;
import com.spring.onlinejudge.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 代码沙箱工厂
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱事例
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }


}
