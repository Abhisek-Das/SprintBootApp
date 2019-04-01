package com.abhi.boot.service;

import java.util.List;
import com.abhi.boot.model.Book;

public interface BookService {
	
	void saveBook(Book book);
	public List<Book> findAllBooks();
	void deleteBook(long bookid);

//	Book findByBookId(long bookid);
	Book findByBookId(long id);
	Book findByTitle(String title);

}
