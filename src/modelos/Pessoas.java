package modelos;

import java.util.Scanner;

public class Pessoas {
    /*
     * Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na tela a altura média
     * das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
     * pessoas caso houver.
     *
     * Resposta Nelio: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
     */

    public static void alturas(){
        int n, somaIdade = 0;
        double mediaAltura = 0.0, somaAltura =0.0, tamVetor, percIdade;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        n = leitor.nextInt();

        Pessoas[] vetorPessoas = new Pessoas[n];

        //cadastras pessoas no vetor
        for (int i = 0; i<n; i++){
            System.out.println("Dados da "+(i+1)+"a pessoa:");
            System.out.print("Nome: ");
            vetorPessoas[i].nome = leitor.next();
            System.out.print("Idade: ");
            vetorPessoas[i].idade = leitor.nextInt();
            System.out.print("Altura: ");
            vetorPessoas[i].altura = leitor.nextDouble();
        }

        //calcular a media das alturas
        for(int i=0; i<n; i++){
            somaAltura += vetorPessoas[i].altura;
        }

        mediaAltura = somaAltura/n;

        System.out.println("Altura média: "+mediaAltura);

        //calcular porcentagem dos menores de 16 anos
        for(int i=0; i<n; i++){
            if(vetorPessoas[i].idade < 16){
                somaIdade += vetorPessoas[i].idade;
            }
        }

        tamVetor = vetorPessoas.length;
        if (somaIdade > 0){
            percIdade = (somaIdade*100)/tamVetor;

            System.out.printf("Pessoas com menos de 16: %.1f%%", percIdade);
        }


        leitor.close();
    }

    private String nome;
    private int idade;
    private double altura;

    public Pessoas() {
    }

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
