package com.mybookstore.sharmila.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;


@MappedSuperclass  // log
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdBy", "updatedBy","createdAt", "updatedAt"},
        allowGetters = true
)

public abstract class Audit implements Serializable {
    @Column
    private String createdBy;

    @Column
    private String updatedBy;

    @CreatedDate
    private Instant createdAt;

    @CreatedDate
    private Instant updatedAt;

    @CreatedDate
    private Instant deleteAt;

    @Column
    private boolean isDeleted;

}
