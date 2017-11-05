package com.cg.uas.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.uas.bean.ApplicationBean;
import com.cg.uas.bean.UniversityBean;

public interface IUasDao {

	/*List<String> retrieveUniversity();*/

	List<String> retrieveUniversity();

	List<String> retrieveProgram(String universityName);

	int addDetails(ApplicationBean application);

	String retrieveProgramId(String programName);

}
