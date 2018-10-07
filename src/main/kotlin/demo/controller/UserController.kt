package demo.controller

import demo.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class UserController : BaseController() {
    @GetMapping("/me")
    fun me(principal: Principal): User {
        val user = User(principal.name)

        return user
    }
}