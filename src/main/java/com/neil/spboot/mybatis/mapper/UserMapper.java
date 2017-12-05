package com.neil.spboot.mybatis.mapper;

import com.neil.spboot.mybatis.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long usrid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long usrid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}