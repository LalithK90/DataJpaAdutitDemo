package com.JpaAuditExample.DataJpaAdutitDemo.repositories;

import com.JpaAuditExample.DataJpaAdutitDemo.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository< Movie, Long> {
    Movie findByName(String name);
}
