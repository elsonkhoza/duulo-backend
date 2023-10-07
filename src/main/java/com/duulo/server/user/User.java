package com.duulo.server.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.nio.file.attribute.UserPrincipal;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "user_email")
    private String email;

    @Column(name="user_password")
    private  String password;

    @Column(name = "email_verified")
    private boolean isEmailVerified;

    @Column(name = "verification_token")
    private String verificationToken;

}
