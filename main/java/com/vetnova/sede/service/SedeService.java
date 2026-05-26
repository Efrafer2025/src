package com.vetnova.sede.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetnova.sede.model.Sede;
import com.vetnova.sede.repository.SedeRepository;

@Service
public class SedeService {

    @Autowired
    private SedeRepository repository;

    public List<Sede> listar() {
        return repository.findAll();
    }

    public Sede guardar(Sede sede) {
        return repository.save(sede);
    }
}