package meu.curso.microservicos.pedido.mapper;

import meu.curso.microservicos.pedido.dto.ItemPedidoDto;
import meu.curso.microservicos.pedido.dto.PedidoDto;
import meu.curso.microservicos.pedido.entities.Pedido;

import java.util.stream.Collectors;

public class PedidoMapper {

    public static PedidoDto toDTO(Pedido pedido) {
        return new PedidoDto(
                pedido.getId(),
                pedido.getDescricao(),
                pedido.getItens() != null ? pedido.getItens().stream()
                        .map(item -> new ItemPedidoDto(item.getId(), item.getNome(), item.getQuantidade()))
                        .collect(Collectors.toList()) : null
        );
    }
}
