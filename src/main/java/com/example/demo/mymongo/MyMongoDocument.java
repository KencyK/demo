package com.example.demo.mymongo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Document
public class MyMongoDocument implements Serializable {
    @Id
    @NotNull
    private Integer id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;
}
