package com.abhi.boot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.boot.model.Book;
import com.abhi.boot.repositories.BookRepository;


@Service("bookService")
//@Component("bookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier("bookrepo")
	private BookRepository bookRepository;

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(long bookid) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookid);
	}

	@Override
	public Book findByBookId(long bookid) {
		
		
		return bookRepository.findByBookId(bookid);
	}

	@Override
	public Book findByTitle(String title) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitle(title);
	}

//	@Override
//	public Book findByBookId(long bookid) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
