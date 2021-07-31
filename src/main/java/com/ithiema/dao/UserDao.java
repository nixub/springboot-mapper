package com.ithiema.dao;



import com.ithiema.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
import java.util.Map;

@Mapper

public interface UserDao extends BaseMapper<User> {
    public List<User> findByList(Map<String,Object> map);
}
