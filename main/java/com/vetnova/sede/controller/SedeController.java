package com.vetnova.sede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vetnova.sede.model.Sede;
import com.vetnova.sede.service.SedeService;

@RestController
@RequestMapping("/sede")
public class SedeController {

    @Autowired
    private SedeService service;

    @GetMapping
    public List<Sede> listar() {
        return service.listar();
    }

    @PostMapping
    public Sede guardar(@RequestBody Sede sede) {
        return service.guardar(sede);
    }
}