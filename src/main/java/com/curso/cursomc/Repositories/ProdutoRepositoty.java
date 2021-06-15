package com.curso.cursomc.Repositories;

import com.curso.cursomc.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositoty extends JpaRepository<Produto,Integer> {
}
