package com.duulo.server.likes;

import com.duulo.server.profile.Profile;
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
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    // The profile the user liked
    // The user will use this id to see the profile he liked
    @Column(name = "profile_liked_id")
    Long profileLikedId;

    @Column(name = "approved")
    boolean isApproved=false;

    @JoinColumn(name = "profile_id")
    Profile profile; // The user that liked
}
