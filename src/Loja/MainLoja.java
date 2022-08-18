package Loja;

import Loja.Enums.StatusPedido;
import Loja.models.Cliente;
import Loja.models.ItemPedido;
import Loja.models.Produto;

import java.util.*;
import java.util.Scanner;

public class MainLoja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Dados do Cliente
        String nomeCliente, emailCliente;
        Date dataNascimentoCliente = new Date(2012,Calendar.MAY,9);;
        Cliente cliente;
        //Item Pedido
        StatusPedido statusPedido;
        int quantidade;
        //Dados do Produto
        Produto produto;
        String produtoNome;
        Double produtoPreco;
        int quantidadeProduto;

       /* Entrando com os dados do cliente */
        System.out.println("Digite o nome do Cliente:");
        nomeCliente = leitor.next();
        System.out.println("Digite o email do Cliente:");
        emailCliente = leitor.next();
        cliente = new Cliente(nomeCliente, emailCliente, dataNascimentoCliente);

        /* Entrando com os dados do pedido */
        System.out.println("Qual status do pedido?");
        //Aqui tem que receber o status com o enum (?)
        System.out.println("Quantos itens neste pedido?");
        quantidade = leitor.nextInt();

        /* Entrando com os produtos do pedido */
        for (int i=0; i<quantidade; i++){
            System.out.println("==== Entre com os dados do produto "+(i+1)+" ====");
            System.out.println("Digite o nome do Produto:");
            produtoNome = leitor.next();
            System.out.println("Digite o preço do Produto:");
            produtoPreco = leitor.nextDouble();
            System.out.println("Digite a quantidade:");
            quantidadeProduto = leitor.nextInt();
        }

        leitor.close();
    }
}
