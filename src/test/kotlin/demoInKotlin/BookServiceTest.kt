package demoInKotlin

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime
import kotlin.test.assertEquals


@SpringBootTest
class BookServiceTest {

    @Test
    fun `should mock repository and return`() {
        var mockBooks = listOf<Books>(
            Books("1", "weiwei", "d", LocalDateTime.MAX),
            Books("2", "weiwei", "d", LocalDateTime.MIN)
        )

        val mockBookRepository: BookRepository = Mockito.mock(BookRepository::class.java)
        Mockito.`when`(mockBookRepository.findAll()).thenReturn(mockBooks)

        val bookService = BookService(mockBookRepository);
        var newList = bookService.findBooks();
        assertEquals(2, newList.size)
        assertEquals("[Books(id=1, name=weiwei, author=d, writeAt=+999999999-12-31T23:59:59.999999999), Books(id=2, name=weiwei, author=d, writeAt=-999999999-01-01T00:00)]"
        ,newList.toString())

    }


}