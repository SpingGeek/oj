package com.spring.onlinejudgesandbox.model;

import lombok.Data;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-06
 * 进程执行信息
 */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;


}
