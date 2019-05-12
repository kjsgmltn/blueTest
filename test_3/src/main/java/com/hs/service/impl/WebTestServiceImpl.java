package com.hs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.service.webService;
import com.hs.vo.MemberVO;


@Service
public class WebTestServiceImpl implements webService {
	
	
	@Autowired
	private WebTestDaoService WebTestDaoService;

	
	
   public List<MemberVO> getData(MemberVO MemberVo) throws Exception {
		
	   
		return WebTestDaoService.getData(MemberVo);
	}

}
