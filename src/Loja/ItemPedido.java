package Loja;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;

    //setters e getters

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //construtores
    public ItemPedido() {
    }

    public ItemPedido(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Método que retornar o cálculo do sub total do pedido
    public Double subTotal(){
        return quantidade * preco;
    }
}
