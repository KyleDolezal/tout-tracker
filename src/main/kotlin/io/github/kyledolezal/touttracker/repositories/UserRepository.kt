package io.github.kyledolezal.touttracker.repositories

import io.github.kyledolezal.touttracker.models.User
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User?, Long?> {
    fun findByUsername(username: String?): Optional<User?>?
    fun existsByUsername(username: String?): Boolean?
    fun existsByEmail(email: String?): Boolean?
}