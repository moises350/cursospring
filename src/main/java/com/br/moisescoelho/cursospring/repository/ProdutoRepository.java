package com.br.moisescoelho.cursospring.repository;

import com.br.moisescoelho.cursospring.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
