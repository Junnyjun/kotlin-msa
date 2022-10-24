package git.io.users.jpa

import org.springframework.data.jpa.repository.JpaRepository

sealed interface UserRepository : JpaRepository<Users, Long> {
    fun findByEmail(email: String): Users?
}