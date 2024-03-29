package com.tomtom.productservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Data
public class BaseEntity {
    @Id
    public String id;
    public String name;
    public String category;
    public String subCategory;
    public String desc;    
    public String createdBy;
    public String updatedBy;
    public Instant createdAt;
    public Instant updatedAt;
}
