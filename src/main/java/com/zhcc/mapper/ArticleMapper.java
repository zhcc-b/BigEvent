package com.zhcc.mapper;

import com.zhcc.pojo.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    //new
    @Insert("insert into article(title, content, cover_img, state, category_id, create_user, create_time, update_time) " +
            "values(#{title}, #{content}, #{coverImg}, #{state}, #{categoryId}, #{createUser}, #{createTime}, #{updateTime})")
    void add(Article article);

    //由resource中的.xml映射
    List<Article> list(Integer userId, Integer categoryId, String state);

    //updated the article
    @Update("update article set title = #{title}, content = #{content}, cover_img = #{coverImg}, state = #{state}, category_id = #{categoryId}, update_time = #{updateTime} where id = #{id}")
    void update(Article article);

    //find article by id
    @Select("select * from article where id = #{id}")
    Article findById(Integer id);

    @Delete("delete from article where id = #{id}")
    void deleteById(Integer id);
}
