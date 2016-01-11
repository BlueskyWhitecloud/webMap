package com.bocc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberAction {

	// check if this mobile have been registered
	@RequestMapping("/CheckMember.json")
	public String CheckMember(HttpServletRequest request, String merchantId, String page)  {
		HttpSession session = request.getSession();

		String mobile="";
		
		return "loginMember";
	}
	
	@RequestMapping("/MemberInfoBindReq.html")
	public String MemberInfoBindReq(HttpServletRequest request, String merchantId, String page) {
		HttpSession session = request.getSession();

		String mobile="";
		Date d=new Date();
		System.out.println(d);
		String server_url=request.getServletPath();
		System.out.println(server_url+"#####"+"MemberInfoBindReq.html");
		
		return "loginMember";
	}
	//add or update memberInfo
	@RequestMapping("/UpdateMemberInfo.html")
	public String UpdateMemberInfo(HttpServletRequest request, String merchantId, String page) {
		HttpSession session = request.getSession();
	    String server_url=request.getContextPath();
		String mobile="";
		Date d=new Date();
		System.out.println(d);
		System.out.println(server_url+"#####"+"UpdateMemberInfo");
		return "loginMember";
	}

}
