package com.JpaAuditExample.DataJpaAdutitDemo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners( {AuditingEntityListener.class} )
@Getter
@Setter
public abstract class AuditableEntity< PK extends Serializable > extends AbstractPersistable< PK > {


    private @CreatedDate
    LocalDateTime createdDate;


    private @LastModifiedDate
    LocalDateTime lastModifiedDate;

    @ManyToOne
    private @CreatedBy
    User createdBy;

    @ManyToOne
    private
    @LastModifiedBy
    User lastModifiedBy;

}
