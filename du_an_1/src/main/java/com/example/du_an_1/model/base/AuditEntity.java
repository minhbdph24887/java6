package com.example.du_an_1.model.base;

import com.example.du_an_1.infrastructure.AuditEntityListener;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditEntityListener.class)
public abstract class AuditEntity {
    @Column(updatable = false)
    private Long createdDate;

    @Column
    private Long lastModifiedDate;
}
