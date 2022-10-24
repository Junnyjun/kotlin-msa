package git.io.users.model

import git.io.users.jpa.Users
import org.jetbrains.annotations.NotNull

data class RequestUser(
    private val name: String ?= error("name is required"),
    private val email: String ?= error("email is required"),
    private val password: String ?= error("password is required")
){
    fun toUser()= Users(id= 0, name= name!!, email= email!!, password= password!!)

}