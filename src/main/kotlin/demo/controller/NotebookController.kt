package demo.controller

import demo.model.Notebook
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class NotebookController : BaseController() {
    @GetMapping("/notebooks")
    fun notebooks(principal: Principal): List<Notebook> {
        val oAuth2Authentication = principal as OAuth2Authentication
        val oAuth2AuthenticationDetails = oAuth2Authentication.details as OAuth2AuthenticationDetails
        val okHttpClient = OkHttpClient()
        val request = Request.Builder()
                .url("https://graph.microsoft.com/v1.0/me/onenote/notebooks")
                .header("Authorization", "%s %s".format(
                        oAuth2AuthenticationDetails.tokenType, oAuth2AuthenticationDetails.tokenValue))
                .build()
        val response = okHttpClient.newCall(request).execute()
        val body = response.body()?.string()
        val notebooks = JSONObject(body).getJSONArray("value")
        val length = notebooks.length()

        return (1..(length - 1)).map { it -> Notebook(notebooks.getJSONObject(it).getString("displayName")) }
    }
}