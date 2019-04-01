package com.abhi.boot.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.boot.model.Book;
import com.abhi.boot.model.Subject;

@Repository
@Qualifier("subjrepo")
public interface SubjectRepository extends JpaRepository<Subject, Long> {


	Subject findBySubjectId(long subjectid);
	Subject findByDurationInHours(int duration);
      

}
