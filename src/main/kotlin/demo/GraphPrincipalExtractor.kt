package demo

import demo.model.User
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor

class GraphPrincipalExtractor : PrincipalExtractor {
    override fun extractPrincipal(map: MutableMap<String, Any>?): Any {
        val name = map?.get("displayName") as String

        return User(name)
    }
}