package com.tomtom.cartservice.model;

import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
public class BaseEntity {

    @Column(name="created_by")
    public String createdBy;

    @Column(name="updatedBy")
    public String updatedBy;

    @Column(name="created_at")
    public Instant createdAt;

    @Column(name="upddated_at")
    public Instant updatedAt;
}
