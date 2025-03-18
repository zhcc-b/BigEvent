package com.zhcc.mapper;

import com.zhcc.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    //根据用户名查询
    @Select("select * from users where username=#{username}")
    User findByUserName(String username);
    //添加
    @Insert("insert into users(username, password, create_time, update_time) " +
            "values (#{username}, #{password}, now(), now())")
    void add(String username, String password);

    @Update("update users set nickname=#{nickname},email=#{email},update_time=#{updateTime} where id=#{id}")
    void update(User users);

    @Update("update users set user_pic=#{avatarUrl},update_time=now() where id=#{id}")
    void updateAvatar(String avatarUrl, Integer id);

    @Update("update users set password=#{password}, update_time=now() where id=#{id}")
    void updatePwd(String password, Integer id);
}
