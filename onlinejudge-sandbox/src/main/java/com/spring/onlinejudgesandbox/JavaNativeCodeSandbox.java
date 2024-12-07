package com.spring.onlinejudgesandbox;

import com.spring.onlinejudgesandbox.model.ExecuteCodeRequest;
import com.spring.onlinejudgesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {


    /**
     * 执行代码
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
