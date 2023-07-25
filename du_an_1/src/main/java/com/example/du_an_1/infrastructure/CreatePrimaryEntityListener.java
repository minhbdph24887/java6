package com.example.du_an_1.infrastructure;

import com.example.du_an_1.model.base.PrimaryEntity;

import javax.persistence.PrePersist;
import java.util.UUID;

/**
 * @author phongtt35
 */
public class CreatePrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryEntity entity) {
        entity.setId(UUID.randomUUID().toString());
    }
}

