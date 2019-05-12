package com.hs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.hs.vo.MemberVO;


public interface webService {
	
	public List<MemberVO> getData(MemberVO MemberVo) throws Exception;

}
