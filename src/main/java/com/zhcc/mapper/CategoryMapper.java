package com.zhcc.mapper;

import com.zhcc.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    //new add
    @Insert("insert into category(category_name, category_alias, create_user, create_time, update_time) " +
            "values (#{categoryName}, #{categoryAlias}, #{createUser}, #{createTime}, #{updateTime})")
    void add(Category category);

    //select all
    @Select("select * from category where create_user = #{userId}")
    List<Category> list(Integer userId);

    //query by ID
    @Select("select * from category where id = #{id}")
    Category findById(Integer id);

    //update
    @Update("update category set category_name = #{categoryName}, category_alias = #{categoryAlias}, update_time = #{updateTime} where id = #{id}")
    void update(Category category);


    //delete
    @Delete("delete from category where id = #{id}")
    void deleteById(Integer id);
}
