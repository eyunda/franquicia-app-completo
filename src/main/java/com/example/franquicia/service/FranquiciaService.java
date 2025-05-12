package com.example.franquicia.service;

import com.example.franquicia.model.Franquicia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FranquiciaService {
    private List<Franquicia> franquicias = new ArrayList<>();

    public Franquicia saveFranquicia(Franquicia franquicia) {
        franquicias.add(franquicia);
        return franquicia;
    }

    public List<Franquicia> getAllFranquicias() {
        return franquicias;
    }
}