package com.spring.onlinejudgesandbox.model;

import lombok.Data;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;
    /**
     * 消耗内存
     */
    private Long memory;
    /**
     * 消耗时间
     */
    private Long time;
}
