package io.swagger.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(schema = "email",name = "template")
@Data
public class TemplateEntity {
    @Id
    private String id;

    @Column(columnDefinition = "nvarchar(255)")
    private String name;

    @Column(columnDefinition = "text")
    private String html;

    @Column(columnDefinition = "varchar(32)")
    private String status;
}
