package io.swagger.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.threeten.bp.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Table(schema = "email",name = "template")
@Data
@Entity
public class TemplateEntity {
    @Id
    private String id;

    @Column(columnDefinition = "nvarchar(255)")
    private String name;

    @Column(columnDefinition = "text")
    private String html;

    @Column(columnDefinition = "varchar(32)")
    private String status;

    @Column(columnDefinition = "timestamp")
    @CreationTimestamp
    private Date createdDate;

    @Column(columnDefinition = "timestamp")
    @UpdateTimestamp
    private Date lastUpdatedDate;
}
