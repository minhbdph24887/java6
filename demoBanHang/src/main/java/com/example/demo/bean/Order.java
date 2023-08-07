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
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    @ManyToOne()
    @JoinColumn(name = "Username", referencedColumnName = "Username")
    private Account account;

    @Column(name = "CreateDate")
    private LocalDate createDate;

    @Column(name = "Address")
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;
}
