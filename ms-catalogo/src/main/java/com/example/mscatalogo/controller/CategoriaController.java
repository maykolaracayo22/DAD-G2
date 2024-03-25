package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired

    private CategoriaService categoriaService;

    @GetMapping
    ResponseEntity<List<Categoria>> lista(){
        return ResponseEntity.ok(categoriaService.lista());
    }
    @PostMapping

    ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.guardar(categoria));
    }
    @GetMapping("/{id}")

    ResponseEntity<Categoria> BuscarPorid(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(categoriaService.listarPorId(id).get());
    }
    @PutMapping
    ResponseEntity<Categoria> actualizar(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaService.actualizar(categoria));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Categoria>> Eliminar(@PathVariable(required = true) Integer id){
        categoriaService.Eliminar(id);
        return ResponseEntity.ok(categoriaService.lista());

    }



}
