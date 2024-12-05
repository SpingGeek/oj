package com.spring.onlinejudge.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.onlinejudge.model.dto.post.PostQueryRequest;
import com.spring.onlinejudge.model.entity.Post;
import com.spring.onlinejudge.model.vo.PostVO;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子服务
 * @author spring
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post
     * @param add
     */
    void validPost(Post post, boolean add);

    /**
     * 获取查询条件
     *
     * @param postQueryRequest
     * @return
     */
    QueryWrapper<Post> getQueryWrapper(PostQueryRequest postQueryRequest);

    /**
     * 从 ES 查询
     *
     * @param postQueryRequest
     * @return
     */
    Page<Post> searchFromEs(PostQueryRequest postQueryRequest);

    /**
     * 获取帖子封装
     *
     * @param post
     * @param request
     * @return
     */
    PostVO getPostVO(Post post, HttpServletRequest request);

    /**
     * 分页获取帖子封装
     *
     * @param postPage
     * @param request
     * @return
     */
    Page<PostVO> getPostVOPage(Page<Post> postPage, HttpServletRequest request);
}
