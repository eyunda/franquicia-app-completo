package com.example.franquicia.service;

import com.example.franquicia.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    private List<Producto> productos = new ArrayList<>();

    public Producto saveProducto(Producto producto) {
        productos.add(producto);
        return producto;
    }

    public List<Producto> getAllProductos() {
        return productos;
    }

    public void deleteProducto(Long id) {
        productos.removeIf(p -> p.getId().equals(id));
    }
}