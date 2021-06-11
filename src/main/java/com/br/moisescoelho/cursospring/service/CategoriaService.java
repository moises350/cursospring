package com.br.moisescoelho.cursospring.service;

import com.br.moisescoelho.cursospring.models.Categoria;
import com.br.moisescoelho.cursospring.repository.CategoriaRepository;
import com.br.moisescoelho.cursospring.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria find(Integer id){
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        return categoriaOptional.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
