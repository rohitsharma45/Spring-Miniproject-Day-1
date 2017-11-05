package com.cg.uas.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.uas.bean.ApplicationBean;
import com.cg.uas.bean.UniversityBean;
import com.cg.uas.service.IUasService;

@Controller
public class ApplicantController {

	@Autowired
	IUasService service;
	
	
	@RequestMapping("/index")
		public ModelAndView start(){
		
		List<String> uniList=service.retrieveUniversity();
		
		return new ModelAndView ("homepage","list",uniList);
		}
	@RequestMapping("/offered")
	public ModelAndView selectPgm(@RequestParam("universityName")String universityName){
	
		List<String> pgmList=service.retrieveProgram(universityName);
		
		return new ModelAndView("programList","list",pgmList);
	}
	@RequestMapping("/courseSelected")
	public String selectCourse(@RequestParam("programName")String programName,Model model){
		String programId=service.retreiveProgramId(programName);
		model.addAttribute("pgmId",programId);
		model.addAttribute("bean",new ApplicationBean());
	return "form";
	}
	
	@RequestMapping("/register")
	public String registerForm(@ModelAttribute("bean") @Valid ApplicationBean application,@RequestParam("pgmId")String programId,BindingResult br,Model model){
		if(br.hasErrors()){
			return "form";
			}
			else{
				
				application.setStatus(programId);
				application.setStatus("Applied");
				application.setInterviewDate(null);
			int id=service.addDetails(application);
			model.addAttribute("appId",id);
			return "success";
		}
	}
}

