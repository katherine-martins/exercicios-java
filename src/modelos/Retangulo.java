package modelos;

import java.util.Scanner;

public class Retangulo {
    public static void MainRetangulo(){ //static é para o usuário não acessar o método
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        double area, perimetro, diagonal;

        System.out.print("Entre com a largura do retângulo: ");
        retangulo.largura = leitor.nextDouble();
        System.out.print("Entre com a altura do retângulo: ");
        retangulo.altura = leitor.nextDouble();

        area = retangulo.Area();
        perimetro = retangulo.Perimetro();
        diagonal = retangulo.Diagonal();

        System.out.println("");
        System.out.println(retangulo);
    }

    public Double altura;
    public Double largura;

    public double Area(){
        return altura * largura;
    }

    public double Perimetro(){
        return altura + largura;
    }

    public double Diagonal(){
        double diagonal;

        diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));

        return diagonal;
    }

    public String toString(){ //Serve para imprimir no System.out.print()
        return "AREA: "
                + String.format("%.2f", Area())
                + "\nPERÍMETRO: "
                + String.format("%.2f", Perimetro())
                + "\nDIAGONAL: "
                + String.format("%.2f", Diagonal());
    }
}
