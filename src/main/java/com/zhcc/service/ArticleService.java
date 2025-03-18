package com.zhcc.service;

import com.zhcc.pojo.Article;
import com.zhcc.pojo.PageBean;

public interface ArticleService {
    //new article
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    //update article
    void update(Article article);

    //find by id
    Article findById(Integer id);

    //delete by id
    void deleteById(Integer id);
}
