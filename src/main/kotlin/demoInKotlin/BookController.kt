package demoInKotlin

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class BookController(private val service: BookService) {

    @GetMapping
    fun books(): List<Books> = service.findBooks();


    @PostMapping
    fun post(@RequestBody books: Books){
        service.post(books);
    }

}

