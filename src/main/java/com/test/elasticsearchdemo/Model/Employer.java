package com.test.elasticsearchdemo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "employer")
public class Employer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;

}
