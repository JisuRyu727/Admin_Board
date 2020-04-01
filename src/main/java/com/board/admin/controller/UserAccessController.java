package com.board.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.admin.dto.UserAccessDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserAccessController {


	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String callScheduleIndexPage(Model model) {
		log.info("인덱스 페이지로 이동합니다. ");
		
		return "index";
	}

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String callRegisterPage(Model model) {
		log.info("회원가입 페이지로 이동합니다. ");
		
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void registerUserProcess(UserAccessDTO dto) {
		log.info("회원가입 처리를 시행합니다. ");
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String callLoginPage(Model model) {
		log.info("로그인 페이지로 이동합니다. ");
		
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void loginProcess(Model model) {
		log.info("로그인 정보를 세션에 저장합니다. ");
		
	}
	
}
