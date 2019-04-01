package com.abhi.boot.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.boot.model.Book;

@Repository
@Qualifier("bookrepo")
public interface BookRepository extends JpaRepository<Book, Long> {


	Book findByBookId(long bookid);
	Book findByTitle(String title);
    
      

}
