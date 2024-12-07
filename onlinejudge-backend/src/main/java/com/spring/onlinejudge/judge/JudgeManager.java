package com.spring.onlinejudge.judge;

import com.spring.onlinejudge.judge.codesandbox.model.JudgeInfo;
import com.spring.onlinejudge.judge.strategy.DefaultJudgeStrategy;
import com.spring.onlinejudge.judge.strategy.JavaLanguageJudgeStrategy;
import com.spring.onlinejudge.judge.strategy.JudgeContext;
import com.spring.onlinejudge.judge.strategy.JudgeStrategy;
import com.spring.onlinejudge.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
