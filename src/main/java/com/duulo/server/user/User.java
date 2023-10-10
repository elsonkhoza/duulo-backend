package com.duulo.server.user;

import com.duulo.server.profile.Profile;
import jakarta.persistence.*;
import lombok.*;

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

    @OneToOne
    @JoinColumn(name = "profile_id",
    referencedColumnName = "id")
    Profile profile;

}
