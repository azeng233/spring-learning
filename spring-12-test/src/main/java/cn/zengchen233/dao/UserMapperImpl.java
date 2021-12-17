package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getAllUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
         return mapper.getAllUser();
    }
}
