package com.neil.spboot.mybatis.mapper;

import com.neil.spboot.mybatis.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}