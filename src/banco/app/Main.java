package banco.app;

import banco.models.entidades.ContaCorrente;
import banco.models.excecoes.ErroSaque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer numeroConta;
        String nomeTitular;
        Double valor;
        ContaCorrente conta;
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta");
            System.out.println("Numero da conta:");
            numeroConta = leitor.nextInt();
            System.out.println("Nome do titular:");
            nomeTitular = leitor.next();

            conta = new ContaCorrente(numeroConta, nomeTitular);

            System.out.println("Valor do depósito inicial:");
            valor = leitor.nextDouble();
            conta.depositar(valor);
            System.out.println("Saldo: " + conta.getSaldo());

            System.out.println("O limite pra saque é: " + conta.getLimiteSaque());
            System.out.println("Valor do saque:");
            valor = leitor.nextDouble();
            conta.sacar(valor);
            System.out.println("Saldo: " + conta.getSaldo());
        }
        catch(ErroSaque e){ //Erro de Saque
            System.out.println("Erro no saque: "+ e.getMessage());
        }
        catch (RuntimeException e) { //Erros em geral (inclusive erro de formato)
            System.out.println("Erro inesperado");
        }

        leitor.close();
    }
}
