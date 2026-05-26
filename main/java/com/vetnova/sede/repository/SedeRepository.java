package com.vetnova.sede.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vetnova.sede.model.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long> {
}