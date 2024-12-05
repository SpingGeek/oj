package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.PostFavour;
import generator.service.PostFavourService;
import generator.mapper.PostFavourMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【post_favour(帖子收藏)】的数据库操作Service实现
* @createDate 2024-12-05 22:18:22
*/
@Service
public class PostFavourServiceImpl extends ServiceImpl<PostFavourMapper, PostFavour>
    implements PostFavourService{

}




