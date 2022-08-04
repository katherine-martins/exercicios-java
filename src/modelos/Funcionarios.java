package modelos;

import java.util.List;

public class Funcionarios {
    /* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N
    funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no
    salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o
    id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
    listagem atualizada dos funcionários. */
    private int id = 0;
    private String nome;
    private double salario;

    public Funcionarios() {

    }

    public Funcionarios(String nome, double salario) {
        id++;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double aumentoDeSalario(int id, double porcentagem, List<Funcionarios> Funcionario){
        //Tem que colocar um retorno
        double parteSalario;
        for (Funcionarios x : Funcionario) {
            if(x.getId() == id){
                //aqui tem que usar metodo que aumenta salario
                parteSalario = (salario*porcentagem)/100;

                salario +=parteSalario;
                break;
            }
        }

        return salario;
    }

    @Override
    public String toString() {
        return id +
                ", " + nome +
                ", " + salario;
    }
}
