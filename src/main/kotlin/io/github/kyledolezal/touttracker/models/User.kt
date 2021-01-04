package io.github.kyledolezal.touttracker.models
import javax.persistence.*;
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity
@Table(	name = "users",
        uniqueConstraints =
            arrayOf(UniqueConstraint(columnNames = arrayOf("username")),
            UniqueConstraint(columnNames = arrayOf("email")))
        )
public class User() {
    constructor(id: Long, username: String, email: String, password: String) : this() {
        this.id = id
        this.username = username
        this.email = email
        this.password = password
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @NotBlank
    @Size(max = 20)
    var username: String = ""

    @NotBlank
    @Size(max = 50)
    @Email
    var email: String = ""

    @NotBlank
    @Size(max = 120)
    var password: String = ""

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = [JoinColumn(name = "user_id")],
            inverseJoinColumns = [JoinColumn(name = "role_id")])

    private val roles : Set<Role> = HashSet()
}