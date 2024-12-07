package com.spring.onlinejudge.model.dto.question;

import lombok.Data;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-05
 * 判题用例
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;
    /**
     * 输出用例
     */
    private String output;


}
