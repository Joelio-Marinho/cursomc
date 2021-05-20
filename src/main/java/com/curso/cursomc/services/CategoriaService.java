package com.curso.cursomc.services;

import com.curso.cursomc.Repositories.CategoriaRepositoty;
import com.curso.cursomc.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepositoty categoriaRepositoty;


    public Categoria buscar(Integer id){
        Optional<Categoria> categoria= categoriaRepositoty.findById(id);
        return categoria.orElse(null);
    }
}
