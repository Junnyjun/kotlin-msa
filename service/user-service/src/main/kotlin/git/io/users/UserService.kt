package git.io.users

import git.io.users.jpa.UserRepository
import git.io.users.jpa.Users
import git.io.users.model.RequestUser
import org.springframework.stereotype.Service

sealed interface UserService {
    fun create(requestUser: RequestUser): Users

    @Service
    class UserServiceImpl(
        private val userRepository: UserRepository
        ) : UserService{
        override fun create(requestUser: RequestUser) = userRepository.save(requestUser.toUser())
    }

}