package io.github.kyledolezal.touttracker.repositories

import io.github.kyledolezal.touttracker.models.ERole
import io.github.kyledolezal.touttracker.models.Role
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role?, Long?> {


}


