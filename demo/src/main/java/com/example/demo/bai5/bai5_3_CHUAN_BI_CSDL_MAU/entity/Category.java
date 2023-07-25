package com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Catgoties")
@SuppressWarnings("serial") // SuppressWarnings là một chú thích của Java cho phép “shut down” java compiler khi nó lèm bèm về một điều mà nó cảm thấy không đúng
public class Category implements Serializable {
    @Id
    @Column(name = "Id")
    @JsonIgnore
    private String id;

    @Column(name = "Name")
    private String name;
}
