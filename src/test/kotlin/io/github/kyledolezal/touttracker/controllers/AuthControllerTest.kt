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

    protected fun setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext!!).build()
    }

    @Test
    fun `User registration creates a new user`() {
        val mockMvc = MockMvcBuilders
                .standaloneSetup(authController)
                .build()

//        val mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext!!).build()
//        mvc.perform(MockMvcRequestBuilders.post("http://localhost:$port/api/register", User(67132L, "username913627", "email613272@asdf.com", "password122"))
//        mockMvc.perform(post("http://localhost:$port/api/register", User(67132L, "username913627", "email61327@asdf.com", "password12")))
//                .andExpect(status().is1xxInformational)
//                .andReturn()


//        var user = restTemplate.postForObject<User>("http://localhost:$port/api/register", User(91172112L, "username91111227", "email92111217@asdf.com", "password12"), User::class)
        var user = restTemplate.postForEntity<User>("http://localhost:$port/api/register", User(912352L, "username923527", "email95dd3211@asdf.com", "password122"), User::class)
//      rest

//        localMockRepository.save(User(97112L, "username91127", "email91127@asdf.com", "password12"))
//        Mockito.verify(localMockRepository, times(1)).save(any<User>(User::class.java))
        print("---------------")
        println(user)
        print("---------------")
        assertThat(1).isEqualTo(1)
    }
}