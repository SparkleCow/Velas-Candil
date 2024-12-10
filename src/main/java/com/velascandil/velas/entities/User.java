package com.velascandil.velas.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "password", length = 30, nullable = false)
    private String password;

    @Column(name = "enabled")
    private boolean enabled = false;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}
