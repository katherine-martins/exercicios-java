package loja;

import loja.enums.StatusPedido;
import loja.models.Cliente;
import loja.models.Produto;

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
0        int quantidade;
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

        /*Lista de Pedidos: Falta printar na tela do usuario */
        /* Exemplo de saida
        Order moment: 20/04/2018 11:25:09
        Order status: PROCESSING
        Client: Alex Green (15/03/1985) - alex@gmail.com
        Order items:
        TV, $1000.00, Quantity: 1, Subtotal: $1000.00
        Mouse, $40.00, Quantity: 2, Subtotal: $80.00
        Total price: $1080.00 */

        leitor.close();
    }
}
