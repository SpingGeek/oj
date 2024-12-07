package com.spring.onlinejudge.judge.codesandbox.impl;

import com.spring.onlinejudge.judge.codesandbox.CodeSandbox;
import com.spring.onlinejudge.judge.codesandbox.model.ExecuteCodeRequest;
import com.spring.onlinejudge.judge.codesandbox.model.ExecuteCodeResponse;
import com.spring.onlinejudge.judge.codesandbox.model.JudgeInfo;
import com.spring.onlinejudge.model.enums.JudgeInfoMessageEnum;
import com.spring.onlinejudge.model.enums.QuestionSubmitStatusEnum;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 示例代码沙箱
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }


}
