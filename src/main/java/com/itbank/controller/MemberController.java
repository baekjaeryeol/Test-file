package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MemberDAO;
import com.itbank.model.MemberDTO;

@Controller
public class MemberController {
	
	@Autowired private MemberDAO dao;

	@GetMapping("/member")
	public ModelAndView memberList() {
		ModelAndView mav = new ModelAndView("member");
		List<MemberDTO> list = dao.selectList();
		mav.addObject("list", list);
		return mav;
	}
}
