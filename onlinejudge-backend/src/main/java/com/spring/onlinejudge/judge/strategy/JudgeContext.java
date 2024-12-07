package com.spring.onlinejudge.judge.strategy;

import com.spring.onlinejudge.judge.codesandbox.model.JudgeInfo;
import com.spring.onlinejudge.model.dto.question.JudgeCase;
import com.spring.onlinejudge.model.entity.Question;
import com.spring.onlinejudge.model.entity.QuestionSubmit;
import java.util.List;
import lombok.Data;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
