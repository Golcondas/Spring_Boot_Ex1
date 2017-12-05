package com.neil.spboot.mybatis.mapper;

import com.neil.spboot.mybatis.model.Neil;

public interface NeilMapper {
    int insert(Neil record);

    int insertSelective(Neil record);
}