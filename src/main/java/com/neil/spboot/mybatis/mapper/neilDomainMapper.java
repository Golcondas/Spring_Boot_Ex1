package com.neil.spboot.mybatis.mapper;

import com.neil.spboot.mybatis.model.neilDomain;
import com.neil.spboot.mybatis.model.neilDomainExample;
import java.util.List;

public interface neilDomainMapper {
    long countByExample(neilDomainExample example);

    int insert(neilDomain record);

    int insertSelective(neilDomain record);

    List<neilDomain> selectByExample(neilDomainExample example);
}