package demo.controller

import demo.model.User
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class UserController : BaseController() {
    @GetMapping("/me")
    fun me(principal: Principal): User {
        return (principal as OAuth2Authentication).userAuthentication.principal as User
    }
}