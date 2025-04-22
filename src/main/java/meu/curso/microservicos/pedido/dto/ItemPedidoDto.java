package meu.curso.microservicos.pedido.dto;


public class ItemPedidoDto {

    private Long id;
    private String nomeProduto;
    private Integer quantidade;

    public ItemPedidoDto() {
    }

    public ItemPedidoDto(Long id, String nomeProduto, Integer quantidade) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}