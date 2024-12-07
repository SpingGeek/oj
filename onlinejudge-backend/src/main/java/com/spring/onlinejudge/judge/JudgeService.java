package com.spring.onlinejudge.judge;

import com.spring.onlinejudge.model.entity.QuestionSubmit;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
