package com.example.franquicia.controller;

import com.example.franquicia.model.Franquicia;
import com.example.franquicia.service.FranquiciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/franquicias")
public class FranquiciaController {

    @Autowired
    private FranquiciaService franquiciaService;

    @PostMapping
    public Franquicia addFranquicia(@RequestBody Franquicia franquicia) {
        return franquiciaService.saveFranquicia(franquicia);
    }

    @GetMapping
    public List<Franquicia> getAll() {
        return franquiciaService.getAllFranquicias();
    }

    @PutMapping("/{id}")
    public Franquicia updateFranquicia(@PathVariable Long id, @RequestBody Franquicia franquicia) {
        franquicia.setId(id);
        return franquiciaService.saveFranquicia(franquicia);
    }
}