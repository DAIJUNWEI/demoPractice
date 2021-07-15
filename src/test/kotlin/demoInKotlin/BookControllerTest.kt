package demoInKotlin

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
class BookControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc


    @Test
    fun `should get all book messages when get books`() {
        mockMvc.perform(MockMvcRequestBuilders
            .get("/books")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(String())
        ).andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("[{\"id\":\"12\",\"name\":\"Hello!1111\",\"author\":\"Hello!1111\",\"writeAt\":\"2017-03-08T12:30:54\"},{\"id\":\"1\",\"name\":\"Hello!1111\",\"author\":\"Hello!1111\",\"writeAt\":\"2017-03-08T12:30:54\"}]"))



    }

}