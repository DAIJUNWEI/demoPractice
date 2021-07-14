package demo


import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "books")
data class Books(@Id val id: String?, val name: String, val author:String, val writeAt: LocalDateTime)
