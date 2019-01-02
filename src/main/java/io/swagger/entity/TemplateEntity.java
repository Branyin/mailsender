package io.swagger.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.threeten.bp.LocalDateTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "template")
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class TemplateEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;

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
