package com.manager.meetingManager.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=2, max=30, message = "Imię musi być dłuższe niż 2 a krótsze niż 30 znaków")
    private String firstName;

    @NotNull
    @Size(min=2, max=50, message = "Nazwisko musi być dłuższe niż 2 a krótsze niż 50 znaków")
    private String lastName;

    @Size(min=9, max=20, message = "Za krótki numer")
    private String phoneNumber;

    @Email
    @Size(min=5, max=50, message = "Nie poprawny adres e-mail")
    private String email;

    @Size(min=5, max=30, message = "Login musi być dłuższy niż 5 a krótsze niż 30 znaków")
    private String login;

    @Size(min=5, max=30)
    private String password;
}
