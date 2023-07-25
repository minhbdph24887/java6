package com.example.du_an_1.model;

import com.example.du_an_1.model.base.PrimaryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author thangdt
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class Role extends PrimaryEntity implements Serializable {

    private String name;
}
