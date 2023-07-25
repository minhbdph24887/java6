package com.example.demo.bai5.bai5_3_CHUAN_BI_CSDL_MAU.entity;

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
@Table(name = "OrderDetails")
@SuppressWarnings("serial")
public class OrderDetail implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    private Product product;

    @Column(name = "Price")
    private Float price;

    @Column(name = "Quantity")
    private Integer quantity;
}
