package git.io.users.jpa

import java.time.LocalDateTime
import java.time.LocalDateTime.now
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id

@Entity
class Users(
    @Id
    @GeneratedValue(strategy = AUTO)
    val id:Long,
    val name:String,
    val email:String,
    val password:String,
    val createdAt: LocalDateTime = now(),
) {
    constructor() : this(0, "", "", "")
}