package meu.curso.microservicos.pedido.dto;

import java.util.List;

public class PedidoDto {
    private Long id;
    private String descricao;
    private List<ItemPedidoDto> itens;

    public PedidoDto() {}

    public PedidoDto(Long id, String descricao, List<ItemPedidoDto> itens) {
        this.id = id;
        this.descricao = descricao;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemPedidoDto> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoDto> itens) {
        this.itens = itens;
    }
}
