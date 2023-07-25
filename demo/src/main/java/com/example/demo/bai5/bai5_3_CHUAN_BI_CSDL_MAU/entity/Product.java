package com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Products")
@SuppressWarnings("serial")
public class Product implements Serializable {
    @Id
    @Column(name = "Id")
    @JsonIgnore
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Image")
    private String image;

    @Column(name = "Price")
    private Float price;

    @Temporal(TemporalType.DATE)
    @Column(name = "CreateDate")
    private Date createDate = new Date();

    @Column(name = "Available")
    private Boolean avaliable;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;


}
