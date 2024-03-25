package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CategoriaService {
    List<Categoria> lista();
    Categoria guardar(Categoria categoria);
    Optional<Categoria> listarPorId(Integer id);
    Categoria actualizar(Categoria categoria);

    void Eliminar(Integer id);
}
