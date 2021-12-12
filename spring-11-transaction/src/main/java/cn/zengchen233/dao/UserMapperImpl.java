package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        User user = new User(3, "曾晨", "123456");
        mapper.addUser(user);
        mapper.delUser(3);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int delUser(int uid) {
        return getSqlSession().getMapper(UserMapper.class).delUser(uid);
    }
}
