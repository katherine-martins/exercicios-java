package loja.models;

public class Produto {
    private String nome;
    private Double preco; //é recomendado colocar wrapper nas propriedades pois é melhor quando for integrar com BD

    public String getNome() {
        return nome;
    }

    //setters e getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //construtores
    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "-Produto-" +
                "\nNome: " + nome +
                "\nPreço: " + preco;
    }
}
