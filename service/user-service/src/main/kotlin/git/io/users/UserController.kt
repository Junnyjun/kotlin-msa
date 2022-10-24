package git.io.users

import git.io.users.model.Greeting
import git.io.users.model.RequestUser
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class UserController(
    private val greeting: Greeting,
    private val userService: UserService
) {

    @GetMapping("/health_check")
    fun status() = "Working"

    @GetMapping("/welcome")
    fun welcome() = greeting.message

    @PostMapping("/users")
    fun createUser(requestUser: RequestUser) = ResponseEntity.status(HttpStatus.CREATED).body(userService.create(requestUser))
}