package meu.curso.microservicos.pedido.repositories;

import meu.curso.microservicos.pedido.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
