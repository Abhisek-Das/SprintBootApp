package com.abhi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.boot.model.Book;
import com.abhi.boot.model.Subject;
import com.abhi.boot.service.BookService;
import com.abhi.boot.service.SubjectService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	@RequestMapping("/")
	String runApp() {
		return "Test";
	}
	
	@Autowired
	BookService bookService;
	@Autowired
	SubjectService subjectService;
	
		
	@RequestMapping(value="/test")
	public String test() {
		return "Test";
	}
	
	@RequestMapping(value="/addBook")
	public String addBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "addBook";
	}
	
	@RequestMapping(value="/saveBook",method=RequestMethod.POST)
	public String saveBook(@ModelAttribute Book book, Model model) {
		bookService.saveBook(book);
		return "addBook";
	}
	
	@RequestMapping("/viewBook")
	public String viewBook(Model model) {
		
		List<Book> booklist = bookService.findAllBooks();
		
		model.addAttribute("list", booklist);
		
		return "viewBook";
		
	}
	
	@RequestMapping(value="/deleteBook/{bookID}",method=RequestMethod.GET)
	public String deleteBook(@PathVariable("bookID") int bookID, Model model) {
		
		bookService.deleteBook(bookID);
		
		List<Book> booklist = bookService.findAllBooks();
		System.out.println("in delete bookk---after getbook"+booklist);
		
		model.addAttribute("list", booklist);
		
		return "viewBook";
	}

	
	@RequestMapping("/viewSubject")
	public String viewSubject(Model model) {
		
		List<Subject> subjlist = subjectService.findAllSubjects();
		
		model.addAttribute("list", subjlist);
	
		return "viewSubject";
		
	}
	
	@RequestMapping(value="/deleteSubject/{subjectID}",method=RequestMethod.GET)
	public String deleteSubject(@PathVariable("subjectID") long subjectID, Model model) {
		subjectService.deleteSubject(subjectID);
		
		List<Subject> subjlist = subjectService.findAllSubjects();
		
		model.addAttribute("list", subjlist);
		
		return "viewSubject";
	}
	
	@RequestMapping("/searchBook/{bookID}")
	public String searchBook(@PathVariable("bookID") long bookID, Model model) {
		Book booklist = bookService.findByBookId(bookID);
		
		model.addAttribute("book", booklist);
		
		return "searchBook";
		
	}
	
	@RequestMapping("/searchSubject/{subjectID}")
	public String searchSubject(@PathVariable("subjectID") long subjectID, Model model) {
		Subject subjlist = subjectService.findBySubjectId(subjectID);
		
		model.addAttribute("subject", subjlist);
		
		return "searchSubject";
		
	}
	
	@RequestMapping("/searchBookTitle/{title}")
	public String searchBookTitle(@PathVariable("title") String title, Model model) {
		Book booklist = bookService.findByTitle(title);
		
		model.addAttribute("book", booklist);
		
		return "searchBook";
		
	}
	
	@RequestMapping("/searchSubjectDur/{duration}")
	public String searchSubject(@PathVariable("duration") int duration, Model model) {
		Subject subjlist = subjectService.findByDurationInHours(duration);
		
		model.addAttribute("subject", subjlist);
		
		return "searchSubject";
		
	}


//	@RequestMapping("/addSubject")
//	public void addSubject() {
//		
//		List<Book> booklist = new ArrayList<Book>();
//		List<Subject> subjectList = new ArrayList<Subject>();
//		
//		
//			
//			try {
//				bookService.saveBook(new Book(12121,"Maths Book", 30, 500, new SimpleDateFormat("yyyy-mm-dd").parse("2019-10-20")));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				bookService.saveBook(new Book(98989,"History Book", 90, 900, new SimpleDateFormat("yyyy-mm-dd").parse("2019-12-20")));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			/* Define Subject1 */
//			Subject subject1 = new Subject();
//			subject1.setSubjectId(10000);
//			subject1.setSubtitle("Physics");
//			subject1.setDurationInHours(5);
//			subject1.setReferences(booklist);
//			
//			subjectService.saveSubject(subject1);
//
//			/* Define Subject2 */
//			Subject subject2 = new Subject();
//			subject2.setSubjectId(20000);
//			subject2.setSubtitle("Mathematics");
//			subject2.setDurationInHours(7);
//			subject2.setReferences(booklist);
//			
//			subjectService.saveSubject(subject2);
//			
////			/* Create SubjectList */
////			subjectList.add(subject1);
////			subjectList.add(subject2);
////			
//			System.out.println("booklist in static:"+booklist);
//			System.out.println("subjecttlist in static:"+subjectList);	
//		
//	}
//	
	
}
