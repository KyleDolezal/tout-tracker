package io.github.kyledolezal.touttracker.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
class StaticController {
    @GetMapping("/")
    fun root(response: HttpServletResponse) {
        response.sendRedirect("index.html")
    }
}