package br.com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
