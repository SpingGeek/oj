package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.QuestionSubmit;
import generator.service.QuestionSubmitService;
import generator.mapper.QuestionSubmitMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【question_submit(题目提交)】的数据库操作Service实现
* @createDate 2024-12-05 22:18:22
*/
@Service
public class QuestionSubmitServiceImpl extends ServiceImpl<QuestionSubmitMapper, QuestionSubmit>
    implements QuestionSubmitService{

}




