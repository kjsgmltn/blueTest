package com.hs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hs.vo.MemberVO;

@Repository
public class DaoImpl implements WebTestDaoService {
	
	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace = 
			"org.zerock.mapper.MemberMapper";
	
	public List<MemberVO> getData(MemberVO MemberVo) {
		
		   
		return sqlSession.selectList(namespace + ".getList");
	}

}
