package demo

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class BookService(val db:BookRepository) {

    fun findBooks(): List<Books> = db.findAll();

    fun post(books: Books){
        db.save(books);
    }
}