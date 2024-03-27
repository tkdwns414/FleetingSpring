package com.tkdwns414.Template.domain;

import com.tkdwns414.Template.domain.enums.ERole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private ERole role;

    private String refreshToken;

    @Builder
    public Member(String nickname, ERole role, String refreshToken){
        this.nickname = nickname;
        this.role = role;
        this.refreshToken = refreshToken;
    }
}
