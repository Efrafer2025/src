package com.vetnova.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vetnova.persona.model.Persona;
import com.vetnova.persona.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping
    public List<Persona> listar() {
        return service.listar();
    }

    @PostMapping
    public Persona guardar(@RequestBody Persona persona) {
        return service.guardar(persona);
    }
}