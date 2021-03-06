package com.serlopes.quadrinhos.repository;

import com.serlopes.quadrinhos.model.Quadrinho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuadrinhoRepository extends JpaRepository<Quadrinho, Long> {

    List<Quadrinho> findByEditora(String editora);

    List<Quadrinho> findByTitulo(String titulo);

}
