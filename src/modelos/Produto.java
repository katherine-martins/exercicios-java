package modelos;

import java.util.Scanner;

public class Produto {
    public static void MainProduto(){
        Produto produto = new Produto();
        Scanner leitor = new Scanner(System.in);
        int estoque;

        System.out.println("Entre com os dados do Produto:");
        System.out.print("Nome:");
        produto.nome = leitor.next();
        System.out.print("Preço:");
        produto.preco = leitor.nextDouble();
        System.out.print("Quantidade em estoque:");
        produto.quantidade = leitor.nextInt();

        System.out.print("Dados do Produto: ");
        System.out.println(produto);

        System.out.println("Entre com o numero a ser adicionado em estoque:");
        estoque = leitor.nextInt();
        produto.AddProduto(estoque);

        System.out.println("");
        System.out.print("Dados do Produto Atualizados: ");
        System.out.println(produto);

        System.out.println("Entre com o numero a ser removido do estoque:");
        estoque = leitor.nextInt();
        produto.RemoverProduto(estoque);

        System.out.println("");
        System.out.print("Dados do Produto Atualizados: ");
        System.out.println(produto);
    }
    public String nome;
    public Double preco;
    public int quantidade;

    public double ValorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void AddProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoverProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                + ", $"
                +String.format("%.2f", preco)
                +", "
                +quantidade
                +" unidades, Total $ "
                +String.format("%.2f", ValorTotalEmEstoque());
    }
}
