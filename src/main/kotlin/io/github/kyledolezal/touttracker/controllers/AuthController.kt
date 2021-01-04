package io.github.kyledolezal.touttracker.controllers

import io.github.kyledolezal.touttracker.models.User
import io.github.kyledolezal.touttracker.repositories.UserRepository
import kotlinx.serialization.json.*
import net.minidev.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController
@Autowired
constructor(private val userRepository: UserRepository,
            private val passwordEncoder: BCryptPasswordEncoder) {

    @PostMapping("/api/register")
    fun register(@RequestBody user: User) : String {
        user.password = passwordEncoder.encode(user.password)
        userRepository.save(user)

//        return JSONObject.toJSONString(mapOf("data" to  JSONObject.toJSONString(mapOf(
//            "type" to "user",
//            "id" to user.id,
//            "attributes" to JSONObject.toJSONString(mapOf(
//                    "email" to user.email,
//                    "username" to user.username
//                ))
//            ))
//        ))

//        return JSONObject.toJSONString(mapOf("data" to Json.encodeToJsonElement(mapOf(
//                "type" to "user",
//                "id" to user.id,
//                "attributes" to Json.encodeToJsonElement(mapOf(
//                        "email" to user.email,
//                        "username" to user.username
//                ))
//            ))
//        ))

//        return JSONObject.toJSONString(mapOf("data" to Json.encodeToJsonElement(mapOf(
//                "type" to "user",
//                "id" to user.id,
//                "attributes" to Json.encodeToJsonElement(mapOf(
//                        "email" to user.email,
//                        "username" to user.username
//                ))
//            ))
//        ))
//
//        return JSONObject.toJSONString(mapOf("data" to Json.encodeToJsonElement(mapOf(
//                "type" to "user",
//                "id" to user.id,
//                "attributes" to Json.encodeToJsonElement(mapOf(
//                        "email" to user.email,
//                        "username" to user.username
//                ))
//            ))
//        ))

//        return Json.parseToJsonElement("""{"data":{"type": "user", "id": ${user.id}, "attributes": { "email": "${user.email}", "username": "${user.username}"}}}""")]
        return Json.parseToJsonElement("""{"data":{"type": "user", "id": ${user.id}, "attributes": { "email": "${user.email}", "username": "${user.username}"}}}""").toString()
    }
}