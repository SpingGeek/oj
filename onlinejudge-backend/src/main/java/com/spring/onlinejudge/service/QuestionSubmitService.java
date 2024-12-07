package com.spring.onlinejudge.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.onlinejudge.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.spring.onlinejudge.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.spring.onlinejudge.model.entity.QuestionSubmit;
import com.spring.onlinejudge.model.entity.User;
import com.spring.onlinejudge.model.vo.QuestionSubmitVO;


/**
 * @author spring
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2024-12-05 22:18:22
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {


    /**
     * 题目提交
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);


}
