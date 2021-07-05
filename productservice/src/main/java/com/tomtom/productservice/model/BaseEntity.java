package com.tomtom.productservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class BaseEntity {
    @Id
    public String id;
    public String name;
    public String category;
    public String subCategory;
    public String desc;
}
