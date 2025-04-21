package meu.curso.microservicos.pedido.repositories;

import meu.curso.microservicos.pedido.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<Pedido, Long> {

}
