package demo

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor

class GraphPrincipalExtractor : PrincipalExtractor {
    override fun extractPrincipal(map: MutableMap<String, Any>?): Any {
        return map?.get("displayName") ?: "Unknown"
    }
}