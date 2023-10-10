package com.duulo.server.profile;


import com.duulo.server.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "profile_image_url")
    String profileImageUrl;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}
