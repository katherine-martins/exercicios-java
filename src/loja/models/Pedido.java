package loja.models;

import loja.enums.StatusPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date dataCompra;
    private StatusPedido status;
    private List<ItemPedido> itensPedidos = new ArrayList<>();

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    //método para adicionar item ao pedido
    public void adicionarItem(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
    }

    //método para remover item do pedido
    public void removerItem(ItemPedido itemPedido){
        itensPedidos.remove(itemPedido);
    }

    //construtores
    public Pedido() {
    }

    public Pedido(Date dataCompra, StatusPedido status) {
        this.dataCompra = dataCompra;
        this.status = status;
    }

    //método para calcular o total da compra
    public Double total(){
        Double total = 0.0;
        for (ItemPedido item : itensPedidos){
            total += item.getPreco();
        }
        return total;
    }
}
