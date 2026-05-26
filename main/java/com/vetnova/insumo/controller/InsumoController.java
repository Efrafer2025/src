package com.vetnova.insumo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vetnova.insumo.model.Insumo;
import com.vetnova.insumo.service.InsumoService;

@RestController
@RequestMapping("/insumo")
public class InsumoController {

    @Autowired
    private InsumoService service;

    @GetMapping
    public List<Insumo> listar() {
        return service.listar();
    }

    @PostMapping
    public Insumo guardar(@RequestBody Insumo insumo) {
        return service.guardar(insumo);
    }
}