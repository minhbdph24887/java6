package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Products")
public class Product implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "Name")
    private String nameProduct;

    @Column(name = "Image")
    private String image;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "CreateDate")
    private LocalDate createDate;

    @Column(name = "Available")
    private Boolean available;

    @ManyToOne()
    @JoinColumn(name = "CategoryId", referencedColumnName = "Id")
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<OrderDetail> orderDetails;
}
