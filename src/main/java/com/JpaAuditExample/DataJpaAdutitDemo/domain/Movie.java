package com.JpaAuditExample.DataJpaAdutitDemo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@ToString
public class Movie extends AuditableEntity<Long> {
    private String name;
    
    private Integer year;
    
    @Enumerated(EnumType.STRING)
    private Genre genre;




}
