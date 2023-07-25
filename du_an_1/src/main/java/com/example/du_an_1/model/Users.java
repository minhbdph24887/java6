package com.example.du_an_1.model;

import com.example.du_an_1.infrastructure.EntityProperties;
import com.example.du_an_1.model.base.PrimaryEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * @author thangdt
 */
@Getter
@Setter
@Data
@Table(name = "users")
@Entity
public class Users extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_PHONE, updatable = false)
    private String phone;
    @Column(length = EntityProperties.LENGTH_EMAIL, updatable = false)
    private String email;
    @Lob
    private String password;
    @Column(length = EntityProperties.LENGTH_NAME, updatable = false)
    private String first_name;
    @Column(length = EntityProperties.LENGTH_NAME, updatable = false)
    private String last_name;
    @Column(length = EntityProperties.LENGTH_NAME, updatable = false)
    private String middle_name;
    private boolean gioiTinh;
    @Lob
    @Column( updatable = false)
    private String preferences;
    private Date ngaySinh;
    private int TrangThai;
    @Column(length = EntityProperties.LENGTH_TEXT, updatable = false)
    private String avata;
    @Column(length = EntityProperties.LENGTH_TEXT, updatable = false)
    private String image;
    @Column(length = EntityProperties.LENGTH_TEXT, updatable = false)
    private String diaChi;
    @Column(length = EntityProperties.LENGTH_TEXT, updatable = false)
    private String hocVan;
    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> roles;
}
