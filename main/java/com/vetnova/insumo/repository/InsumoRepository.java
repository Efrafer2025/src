package com.vetnova.insumo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vetnova.insumo.model.Insumo;

public interface InsumoRepository extends JpaRepository<Insumo, Long> {
}