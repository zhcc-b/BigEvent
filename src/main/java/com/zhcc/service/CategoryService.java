package com.zhcc.service;

import com.zhcc.pojo.Category;

import java.util.List;

public interface CategoryService {
    // new category
    void add(Category category);

    //列表查询
    List<Category> list();

    //根据id查询
    Category findById(Integer id);

    //update category
    void update(Category category);

    //delete category
    void deleteById(Integer id);
}
