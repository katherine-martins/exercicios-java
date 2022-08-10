package Loja;

import java.text.SimpleDateFormat;
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
        Integer quantidade;
        //Dados do Produto


       /* Entrando com os dados do cliente */
        System.out.println("Digite o nome do Cliente:");
        nomeCliente = leitor.next();
        System.out.println("Digite o email do Cliente:");
        emailCliente = leitor.next();
        cliente = new Cliente(nomeCliente, emailCliente, dataNascimentoCliente);

        /* Entrando com os dados do pedido */
        System.out.println("Qual status do pedido?");
        //Aqui tem que receber o status com o enum
        System.out.println("Quantos itens neste pedido?");
        quantidade = leitor.nextInt();

        /* Entrando com os produtos
        Enter #1 item data:
        Product name: TV
        Product price: 1000.00
        Quantity: 1
        Enter #2 item data:
        Product name: Mouse
        Product price: 40.00
        Quantity: 2 */





        leitor.close();
    }
}
