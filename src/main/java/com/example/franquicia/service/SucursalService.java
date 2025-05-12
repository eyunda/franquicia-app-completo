package com.example.franquicia.service;

import com.example.franquicia.model.Sucursal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SucursalService {
    private List<Sucursal> sucursales = new ArrayList<>();

    public Sucursal saveSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
        return sucursal;
    }

    public List<Sucursal> getAllSucursales() {
        return sucursales;
    }
}