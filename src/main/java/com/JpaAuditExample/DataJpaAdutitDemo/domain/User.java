package com.JpaAuditExample.DataJpaAdutitDemo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
public class User extends AuditableEntity<Long> {
    private String name;


}
