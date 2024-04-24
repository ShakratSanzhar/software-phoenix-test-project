package com.shakratsanzhar.softwarephoenixproject.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "login")
@ToString
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(unique = true)
    private String login;

    private String password;

    @Transient
    private String passwordConfirmation;

    @Column(name = "full_name")
    private String fullName;

    private String avatar;
}
