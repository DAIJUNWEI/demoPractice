package demoInKotlin

import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest
import java.awt.print.Book
import java.time.LocalDateTime
import kotlin.test.assertEquals


@ExtendWith(MockKExtension::class)
class BookServiceTest {

    @Test
    fun `should mock repository and return`() {
        var mockBooks = listOf<Books>(
            Books("1", "weiwei", "d", LocalDateTime.MAX),
            Books("2", "weiwei", "d", LocalDateTime.MIN)
        )
        var mockBookRepository= mockk<BookRepository>()
        every { mockBookRepository.findAll() } returns mockBooks
        val bookService = BookService(mockBookRepository);
        var newList = bookService.findBooks();
        assertEquals(2, newList.size)
        assertEquals("[Books(id=1, name=weiwei, author=d, writeAt=+999999999-12-31T23:59:59.999999999), Books(id=2, name=weiwei, author=d, writeAt=-999999999-01-01T00:00)]"
        ,newList.toString())

    }


}