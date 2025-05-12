package com.example.franquicia.controller;

import com.example.franquicia.model.Sucursal;
import com.example.franquicia.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping
    public Sucursal addSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.saveSucursal(sucursal);
    }

    @GetMapping
    public List<Sucursal> getAll() {
        return sucursalService.getAllSucursales();
    }

    @PutMapping("/{id}")
    public Sucursal updateSucursal(@PathVariable Long id, @RequestBody Sucursal sucursal) {
        sucursal.setId(id);
        return sucursalService.saveSucursal(sucursal);
    }
}