package com.neil.spboot.mybatis.mapper;

import com.neil.spboot.mybatis.model.student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


public interface studentMapper {
    int insert(student record);

    int insertSelective(student record);
}