package br.com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.domain.ItemPedido;

@Repository
public interface ItemPedidosRepository extends JpaRepository<ItemPedido, Integer>{

}
