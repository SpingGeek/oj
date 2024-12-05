package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.PostThumb;
import generator.service.PostThumbService;
import generator.mapper.PostThumbMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【post_thumb(帖子点赞)】的数据库操作Service实现
* @createDate 2024-12-05 22:18:22
*/
@Service
public class PostThumbServiceImpl extends ServiceImpl<PostThumbMapper, PostThumb>
    implements PostThumbService{

}




