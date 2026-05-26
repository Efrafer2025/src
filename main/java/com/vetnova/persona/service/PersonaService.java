package com.vetnova.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vetnova.persona.model.Persona;
import com.vetnova.persona.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public List<Persona> listar() {
        return repository.findAll();
    }

    public Persona guardar(Persona persona) {
        return repository.save(persona);
    }
}