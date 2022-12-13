package com.unab.catvirtual.catvirtualg24.enitity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "genders")
@Data
@Builder
public class Category {
    @Id
    private String id;
    private String name;
}
