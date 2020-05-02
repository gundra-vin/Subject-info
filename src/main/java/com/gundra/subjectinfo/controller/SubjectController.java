package com.gundra.subjectinfo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gundra.subjectinfo.model.Subject;
import com.gundra.subjectinfo.model.SubjectResponse;

@RestController
public class SubjectController {
	
	
	@GetMapping("/getSubjects")
	public SubjectResponse getSubjects(){
		
		Subject s1 = new Subject(1,1,"Solid Mechanics");
		Subject s2 = new Subject(2,1,"Fluid Mechanics");
		Subject s3 = new Subject(3,2,"ThermoDynamics");
		List<Subject> sublst = new ArrayList<Subject>();
		sublst.add(s1);
		
		sublst.add(s2);
		sublst.add(s3);
		
		SubjectResponse sr = new SubjectResponse();
		sr.setSubjectResponse(sublst);
		
		return sr;
		
	}

}
