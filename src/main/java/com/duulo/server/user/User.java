package com.duulo.server.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "user_id", nullable = false)
    private String id;

    @Column(name = "user_name")
    private  String name;

    @Column(name = "user_email")
    private String email;

    @Column(name="user_password")
    private  String password;

    @Column(name="verification_status")
    private boolean isVerified;
}
