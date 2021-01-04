package io.github.kyledolezal.touttracker.models

import javax.persistence.*

@Entity
@Table(name = "roles")
public class Role(
        @Enumerated(EnumType.STRING)
        @Column(length = 20)
        var name: ERole? = null) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
}