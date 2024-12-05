package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Post;
import generator.service.PostService;
import generator.mapper.PostMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【post(帖子)】的数据库操作Service实现
* @createDate 2024-12-05 22:18:22
*/
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService{

}




