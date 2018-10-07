package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso

@SpringBootApplication
@EnableOAuth2Sso
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}