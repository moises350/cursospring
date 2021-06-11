package com.br.moisescoelho.cursospring.repository;

import com.br.moisescoelho.cursospring.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
