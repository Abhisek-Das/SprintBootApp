package com.abhi.boot.mybootproject;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abhi.boot.model.Book;
import com.abhi.boot.model.Subject;
import com.abhi.boot.repositories.BookRepository;
import com.abhi.boot.repositories.SubjectRepository;
import com.abhi.boot.service.BookService;
import com.abhi.boot.service.SubjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybootprojectApplicationTests {

	@Autowired
	BookService bookService;
	@Autowired
	BookRepository bookRepository;
	@Autowired
	SubjectService subjectService;
	@Autowired
	SubjectRepository subjectRepository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void saveBookTest() {
		
		try {
			bookService.saveBook(new Book(5,"Maths Book", 30, 500, new SimpleDateFormat("yyyy-mm-dd").parse("2019-10-20")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Book booklist = bookService.findByBookId(5);
		System.out.println("book object :"+booklist);
		
		assertEquals(5, booklist.getBookId());
		
	}
	
	@Test
	public void viewBookTest() {
		List<Book> booklist = bookService.findAllBooks();
		if(booklist != null){
			assertThat(booklist.get(0),instanceOf(Book.class));
//			System.out.println(booklist.size());
//			System.out.println(booklist.isEmpty());
			
		}
	}
	
	@Test
	public void deleteBookTest() {
		if(bookService.findByBookId(13)!=null) {
			bookService.deleteBook(13);
		}
		assertNull(bookService.findByBookId(13));
		
	}
	
	@Test
	public void searchBookTest() {
		Book booklist = bookService.findByBookId(10);
		assertEquals(10, booklist.getBookId());
		
	}
	
	@Test
	public void viewSubjectTest() {
		List<Subject> subjlist = subjectService.findAllSubjects();
		if(subjlist != null){
			assertThat(subjlist.get(0),instanceOf(Subject.class));
	
		}
		
	}
	
	@Test
	public void deleteSubjectTest() {
		if(subjectService.findBySubjectId(17)!=null) {
			subjectService.deleteSubject(17);
		}
		assertNull(subjectService.findBySubjectId(17));
		
	}
	
	@Test
	public void saveSubjectTest() {
		
		Subject subj = new Subject();
		subj.setSubjectId(18);
		subj.setDurationInHours(24);
		subj.setSubtitle("Eng-Chap1");
//		List<Book> booklist = bookService.findAllBooks();
//		subj.setReferences(booklist);
		
		subjectService.saveSubject(subj);
		
		
		Subject subjectlist = subjectService.findBySubjectId(18);
		System.out.println("subject object :"+subjectlist);
		
		assertEquals(18, subjectlist.getSubjectId());
		
		
	}
	
	@Test
	public void searchSubjectTest() {
		Subject subjlist = subjectService.findBySubjectId(16);
		assertEquals(16, subjlist.getSubjectId());
		
	}
	
}
