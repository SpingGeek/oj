package com.spring.onlinejudge.judge.strategy;

import com.spring.onlinejudge.judge.codesandbox.model.JudgeInfo;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
