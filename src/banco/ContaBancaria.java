package banco;

import java.util.Scanner;

public class ContaBancaria {
    /*É necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o
    * titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o
    * titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e
    * o saldo inicial da conta será, naturalmente, zero.
    * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o
    * nome do titular pode ser alterado.
    */
    public static void criandoConta(){
        String nome, depositoInicial;
        long conta;
        double saldo, valor;
        ContaBancaria conta1;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero da conta:");
        conta = leitor.nextLong();
        System.out.println("Digite o nome do titular:");
        nome = leitor.next();

        System.out.println("Deseja realizar um depósito inicial? (s/n)");
        depositoInicial = leitor.next();
        if (depositoInicial.equals("s")){
            System.out.println("Valor do depósito inicial:");
            saldo = leitor.nextDouble();
            conta1 = new ContaBancaria(nome, conta, saldo);
        } else {
            conta1 = new ContaBancaria(nome, conta);
        }

        System.out.println(conta1);
        System.out.println("");
        System.out.println("Entre com o valor do depósito:");
        valor = leitor.nextDouble();
        conta1.deposito(valor);
        System.out.println("");

        System.out.println(conta1);
        System.out.println("");
        System.out.println("Entre com o valor do saque:");
        valor = leitor.nextDouble();
        conta1.sacar(valor);
        System.out.println("");

        System.out.println(conta1);

        leitor.close();
    }

    private String nomeTitular;
    private long numeroConta;
    private double saldo = 0.00;

    //Construtores
    public ContaBancaria() {

    }

    public ContaBancaria(String nomeTitular, long numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        deposito(saldo); //caso a função deposito seja alterada, já altera o aqui quando for criada a conta
    }

    public ContaBancaria(String nomeTitular, long numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    //Getters
    public String getNomeTitular() {
        return nomeTitular;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setter
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    /*
     * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
     * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado,
     * o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
     * suficiente para realizar o saque e/ou pagar a taxa.
    */

    //Método para depositar na conta
    public void deposito(double valor){
        saldo += valor;
    }

    //Método para saque
    public void sacar(double valor){
        valor += 5.00;
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Dado da Conta:\n" +
                "Titular da conta:" + nomeTitular +
                "\nConta: " + numeroConta +
                "\nSaldo: " + String.format("%.2f", saldo);
    }
}