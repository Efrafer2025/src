package com.vetnova.insumo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetnova.insumo.model.Insumo;
import com.vetnova.insumo.repository.InsumoRepository;

@Service
public class InsumoService {

    @Autowired
    private InsumoRepository repository;

    public List<Insumo> listar() {
        return repository.findAll();
    }

    public Insumo guardar(Insumo insumo) {
        return repository.save(insumo);
    }
}