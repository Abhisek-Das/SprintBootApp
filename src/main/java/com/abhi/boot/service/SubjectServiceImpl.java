package com.abhi.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.boot.model.Subject;
import com.abhi.boot.repositories.SubjectRepository;

@Service("subjectService")
//@Component("subjectService")
@Transactional
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	@Qualifier("subjrepo")
	private SubjectRepository subjectRepository;

	@Override
	public List<Subject> findAllSubjects() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

	@Override
	public void saveSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepository.save(subject);
	}

	@Override
	public void deleteSubject(long subjectid) {
		// TODO Auto-generated method stub
		subjectRepository.deleteById(subjectid);
	}

	@Override
	public Subject findBySubjectId(long subjectid) {
		// TODO Auto-generated method stub
		return subjectRepository.findBySubjectId(subjectid);
	}

	@Override
	public Subject findByDurationInHours(int duration) {
		// TODO Auto-generated method stub
		return subjectRepository.findByDurationInHours(duration);
	}

}
