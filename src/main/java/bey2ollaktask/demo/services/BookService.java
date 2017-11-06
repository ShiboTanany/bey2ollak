package bey2ollaktask.demo.services;

import bey2ollaktask.demo.entities.Book;
import bey2ollaktask.demo.entities.User;
import bey2ollaktask.demo.repository.BookRepository;
import bey2ollaktask.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserRepository userRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public String reserve(int bookId, int userId) {
        User user = userRepository.findOne(userId);
        Book book = bookRepository.getOne(bookId);
        book.setUser(user);
        book.setAvailability(false);
        bookRepository.save(book);
        user.getBook().add(book);
        userRepository.save(user);
        return "success";

    }
}
