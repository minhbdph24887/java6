package com.example.demo.bai5.bai5_1_XAY_DUNG_RESTFUL_API_VA_TEST_VOI_POSTMAN.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "marks")
    private Double marks;

    @Column(name = "gender")
    private Boolean gender;

    @Column(name = "country")
    private String country;
}
