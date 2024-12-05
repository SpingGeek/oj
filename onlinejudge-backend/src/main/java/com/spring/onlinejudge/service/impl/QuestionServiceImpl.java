package com.spring.onlinejudge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.onlinejudge.mapper.QuestionMapper;
import com.spring.onlinejudge.model.entity.Question;
import com.spring.onlinejudge.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * @author spring
 * @description 针对表【question(题目)】的数据库操作Service实现
 * @createDate 2024-12-05 22:18:22
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
        implements QuestionService {

}




