package demoInKotlin

import org.springframework.stereotype.Service

@Service
class BookService(val db:BookRepository) {

    fun findBooks(): List<Books> = db.findAll();

    fun post(books: Books){
        db.save(books);
    }
}