package demoInKotlin

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
class BookRepositoryTest(@Autowired val bookRepository: BookRepository) {
    @Test
    fun `should save entity`() {

        var entitySaved = bookRepository.save(Books("1", "weiwei", "d", LocalDateTime.MAX))
        val books = bookRepository.findAll();
        assertNotNull(entitySaved)
        assertEquals(1, books.size)
        assertEquals("[Books(id=1, name=weiwei, author=d, writeAt=+169104628-12-10T19:08:16.768)]",books.toString())
    }

}
