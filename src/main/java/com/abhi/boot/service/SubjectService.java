package com.abhi.boot.service;

import java.util.List;

import com.abhi.boot.model.Book;
import com.abhi.boot.model.Subject;

public interface SubjectService {
	
	void saveSubject(Subject subject);
	public List<Subject> findAllSubjects();
	void deleteSubject(long subjectid);
	Subject findBySubjectId(long subjectid);
	Subject findByDurationInHours(int duration);
	

}
