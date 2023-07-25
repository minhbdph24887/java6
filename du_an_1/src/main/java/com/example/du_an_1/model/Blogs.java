package com.example.du_an_1.model;

import com.example.du_an_1.infrastructure.EntityProperties;
import com.example.du_an_1.model.base.PrimaryEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blogs")
@Entity
public class Blogs extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_TEXT, updatable = false)
    private String image;
    @Lob
    private String title;
    @Lob
    private String video;
    private Date ngayTao;
    private int trangThai;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private Users idUser;


}
