package com.spring.onlinejudge.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spring.onlinejudge.model.entity.Post;
import com.spring.onlinejudge.model.entity.PostFavour;
import org.apache.ibatis.annotations.Param;

/**
 * 帖子收藏数据库操作
 *
 * @author spring
 */
public interface PostFavourMapper extends BaseMapper<PostFavour> {

    /**
     * 分页查询收藏帖子列表
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, @Param(Constants.WRAPPER) Wrapper<Post> queryWrapper,
                                    long favourUserId);

}




