package com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Accounts")
@SuppressWarnings("serial")
public class Account implements Serializable {
    @Id
    @Column(name = "Userame")
    @JsonIgnore
    private String userName;

    @Column(name = "Password")
    private String passWord;

    @Column(name = "Fullname")
    private String fullName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Photo")
    private String photo;


}
