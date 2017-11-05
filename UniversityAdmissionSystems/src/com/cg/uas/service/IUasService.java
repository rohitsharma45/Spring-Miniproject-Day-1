package com.cg.uas.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.uas.bean.ApplicationBean;
import com.cg.uas.bean.UniversityBean;

public interface IUasService {

	

	List<String> retrieveUniversity();

	List<String> retrieveProgram(String universityName);

	int addDetails(ApplicationBean application);

	String retreiveProgramId(String programName);

}
