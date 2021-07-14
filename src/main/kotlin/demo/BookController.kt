package demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val service: BookService) {
    @GetMapping(value= ["/books"])
    fun books(): List<Books> = service.findBooks();


    @PostMapping(value= ["/books"])
    fun post(@RequestBody books: Books){
        service.post(books);
    }

}

