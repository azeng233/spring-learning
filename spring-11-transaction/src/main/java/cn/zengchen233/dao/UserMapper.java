package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    // 添加一个用户
    public int addUser(User user);

    //删除一个用户
    public int delUser(@Param("id") int uid);


}
