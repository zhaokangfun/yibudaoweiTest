package com.rk.service.Impl;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.rk.dao.BancibMapper;
import com.rk.entity.Bancib;
import com.rk.service.BancibService;

@Service("bancibService")
public class BancibServiceImpl implements BancibService {

	@Resource
	private BancibMapper bancibMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer banciid) {
		// TODO Auto-generated method stub
		return bancibMapper.deleteByPrimaryKey(banciid);
	}

	@Override
	public int insert(Bancib record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Bancib record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bancib selectByPrimaryKey(Integer banciid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Bancib record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Bancib record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
