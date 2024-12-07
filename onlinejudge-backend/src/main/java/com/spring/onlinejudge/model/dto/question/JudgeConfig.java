package com.spring.onlinejudge.model.dto.question;

import lombok.Data;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-05
 * 判题配置
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制
     */
    private Long timeLimit;
    /**
     * 内存限制
     */
    private Long memoryLimit;
    /**
     * 堆栈限制
     */
    private Long stackLimit;

}
