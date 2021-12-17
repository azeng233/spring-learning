package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    public List<User> getAllUser();
}
