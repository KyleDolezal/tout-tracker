package io.github.kyledolezal.ToutTracker.controllers

import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StaticController {
    @GetMapping("/")
    fun root() : ResponseEntity<Any>{
        return ok().body("success")
    }
}