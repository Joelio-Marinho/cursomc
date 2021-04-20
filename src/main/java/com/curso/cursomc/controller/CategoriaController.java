package com.curso.cursomc.controller;

import com.curso.cursomc.model.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @RequestMapping( method = RequestMethod.GET)
    public List<Categoria> lista(){

        Categoria cat1 = new Categoria(1, "informatica");
        Categoria cat2 = new Categoria(2,"escritorio");
        List<Categoria> list = new ArrayList<>();

        list.add(cat1);
        list.add(cat2);
        return list;
    }
}
