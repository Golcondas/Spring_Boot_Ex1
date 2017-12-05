package com.neil.spboot.mybatis.mapper;

import com.neil.spboot.mybatis.model.Neil;
import com.neil.spboot.mybatis.model.NeilExample;
import java.util.List;

public interface NeilMapper {
    long countByExample(NeilExample example);

    int insert(Neil record);

    int insertSelective(Neil record);

    List<Neil> selectByExample(NeilExample example);
}