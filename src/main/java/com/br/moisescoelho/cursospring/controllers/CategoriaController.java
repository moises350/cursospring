package com.br.moisescoelho.cursospring.controllers;

import com.br.moisescoelho.cursospring.models.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria categoria = new Categoria(1,"Informática");
        Categoria categoria2 = new Categoria(2,"Escritorio");

        List<Categoria> listaCategorias = new ArrayList<>();
        listaCategorias.add(categoria);
        listaCategorias.add(categoria2);

        return listaCategorias;
    }
}
