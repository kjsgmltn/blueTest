package com.hs.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import com.hs.service.*;
import com.hs.vo.MemberVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
	
	
	@Autowired
	private webService webService;

	
	
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        
        String formattedDate = dateFormat.format(date);
        
        List<MemberVO> memberList = null;
        try {
        	memberList  =  webService.getData(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        MemberVO  MemberVo = memberList.get(0);            
        
        System.out.println(MemberVo.getCno());
        System.out.println(memberList);
        
        
        model.addAttribute("bb", memberList );
        model.addAttribute("serverTime", formattedDate );
        
        
        
        //연습 
        for(int i= 1 ; i <10 ; i ++)
        {
        	for(int j = 1; j < 10 ; j ++)
        	{
        		System.out.print(j+"*" + i +"="+i * j );
        		System.out.print('\t' );
        	}
        	
        	System.out.println();
        }
        
        
        
        
        return "home";
    }
    
    /**
     * Tiles를 사용하지 않은 일반적인 형태
     */    
    @RequestMapping("/test.do")
    public String test() {
       
    	try {
			List<MemberVO> bb =  webService.getData(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	return "test";
    }    
    
    /**
     * Tiles를 사용(header, left, footer 포함)
     */        
    @RequestMapping("/testPage.do")
    public String testPage() {
        return "test.page";
    }
    
    /**
     * Tiles를 사용(header, left, footer 제외)
     */    
    @RequestMapping("/testPart.do")
    public String testPart() {
        return "test.part";
    }        
    
}

