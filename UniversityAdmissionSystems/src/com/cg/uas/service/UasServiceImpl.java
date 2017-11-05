package com.cg.uas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.uas.bean.ApplicationBean;
import com.cg.uas.bean.UniversityBean;
import com.cg.uas.dao.IUasDao;

@Service
@Transactional
public class UasServiceImpl implements IUasService{

	
	@Autowired
	IUasDao dao;

	@Override
	public List<String> retrieveUniversity() {
		
		return dao.retrieveUniversity();
	}

	@Override
	public List<String> retrieveProgram(String universityName) {
		
		return dao.retrieveProgram(universityName);
	}

	@Override
	public int addDetails(ApplicationBean application) {
		
		return dao.addDetails(application);
	}

	@Override
	public String retreiveProgramId(String programName) {
		
		return dao.retrieveProgramId(programName);
	}






}
