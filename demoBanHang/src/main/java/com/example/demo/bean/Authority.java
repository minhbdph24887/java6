package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Authorities")
@SuppressWarnings("serial")
public class Authority implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthority;

    @ManyToOne()
    @JoinColumn(name = "Username", referencedColumnName = "Username")
    private Account account;

    @ManyToOne()
    @JoinColumn(name = "RoleId", referencedColumnName = "Id")
    private Role role;
}
