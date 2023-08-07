package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {
    @Id
    @Column(name = "Username")
    private String userName;

    @Column(name = "Password")
    private String passWord;

    @Column(name = "Fullname")
    private String fullName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Photo")
    private String photo;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Authority> authorities;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Order> orders;
}
