package io.github.kyledolezal.touttracker.controllers

import kotlinx.serialization.json.JsonPrimitive
import org.assertj.core.api.Java6Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import io.github.kyledolezal.touttracker.models.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import kotlinx.serialization.json.Json

import org.springframework.web.client.RestTemplate

import org.apache.coyote.http11.Constants.a
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

import org.springframework.test.web.servlet.RequestBuilder

import org.apache.coyote.http11.Constants.a
import org.springframework.test.web.servlet.MvcResult

import org.apache.coyote.http11.Constants.a
import org.apache.coyote.http11.Constants.a
import org.assertj.core.api.Assertions
import org.springframework.boot.test.web.client.*
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.*
import org.mockito.Mockito

import io.github.kyledolezal.touttracker.repositories.UserRepository
import io.github.kyledolezal.touttracker.security.PasswordEncoder

import org.apache.coyote.http11.Constants.a
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.any
import org.mockito.Mockito.times
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.apache.coyote.http11.Constants.a
import org.springframework.test.web.servlet.setup.MockMvcBuilders

import org.apache.coyote.http11.Constants.a
import org.springframework.test.web.servlet.post
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.web.context.WebApplicationContext

import org.springframework.test.web.servlet.MockMvc

import org.apache.coyote.http11.Constants.a
import org.junit.jupiter.api.Disabled
import org.mockito.ArgumentMatchers
import org.springframework.boot.test.mock.mockito.MockBean
import org.mockito.ArgumentCaptor

import org.mockito.Captor

import org.apache.coyote.http11.Constants.a
import org.mockito.ArgumentMatchers.argThat


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AuthControllerTest(@Autowired val restTemplate: TestRestTemplate) {
    @LocalServerPort
    private val port = 0

    @Autowired
    @InjectMocks
    lateinit var authController: AuthController

    @Mock
    lateinit var localMockRepository: UserRepository

    @Mock
    lateinit var localpasswordEnc: BCryptPasswordEncoder

    protected var mvc: MockMvc? = null

    @Autowired
    var webApplicationContext: WebApplicationContext? = null

    @Captor
    lateinit var userCaptor: ArgumentCaptor<User>

    @MockBean
    lateinit var userRepository: UserRepository

    @Test
    fun `User registration creates a new user`() {
        val user = User(1L, "username", "email@email.com", "password")

        restTemplate.postForEntity<User>("http://localhost:$port/api/register", user, User::class)

        Mockito.verify(userRepository).save(argThat { user: User ->
            user.id == 1L &&
            user.email == "email@email.com" &&
            user.username == "username"
        })
    }

    @Test
    fun `User creation results in response with user details`() {
        val user = User(1L, "username", "email@email.com", "password")

        val response = restTemplate.postForEntity<User>("http://localhost:$port/api/register", user, User::class)
        assert(response.statusCode.is2xxSuccessful)
    }
}