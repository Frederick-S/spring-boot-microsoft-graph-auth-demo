package demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@Order(value = 101)
open class SecurityConfig : WebSecurityConfigurerAdapter() {
    @Bean
    open fun getGraphPrincipalExtractor(): GraphPrincipalExtractor {
        return GraphPrincipalExtractor()
    }
}