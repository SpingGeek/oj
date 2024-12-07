package com.spring.onlinejudge.model.dto.questionsubmit;

import java.io.Serializable;
import lombok.Data;

/**
 * @program: onlinejudge
 * @author: spring
 * @create: 2024-12-05
 * 创建请求
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;


    /**
     * 题目 id
     */
    private Long questionId;


    private static final long serialVersionUID = 1L;

}
