package bey2ollaktask.demo.endpoint;

import bey2ollaktask.demo.entities.Book;
import bey2ollaktask.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @RequestMapping(path = "/reverse/{bookId}/{user_id}", method = RequestMethod.GET)
    public String RegisterBookAndUser(@PathVariable int bookId,@PathVariable int user_id){
      return bookService.reserve(bookId,user_id);
    }


}
