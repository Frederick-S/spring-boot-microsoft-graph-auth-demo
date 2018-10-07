package demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController : BaseController() {
    @GetMapping("/")
    fun index() = "hello"
}