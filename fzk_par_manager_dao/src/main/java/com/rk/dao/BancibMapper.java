package com.rk.dao;

import com.rk.entity.Bancib;

public interface BancibMapper {
    int deleteByPrimaryKey(Integer banciid);

    int insert(Bancib record);

    int insertSelective(Bancib record);

    Bancib selectByPrimaryKey(Integer banciid);

    int updateByPrimaryKeySelective(Bancib record);

    int updateByPrimaryKey(Bancib record);
}