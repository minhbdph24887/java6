package com.example.demo7.demo7_2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Roles")
@SuppressWarnings("serial")
public class Role implements Serializable {
    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Name")
    private String name;
}
