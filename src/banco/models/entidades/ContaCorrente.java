package banco.models.entidades;

import banco.models.excecoes.ErroSaque;

public class ContaCorrente {
    /*
    Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta.
     */
    private Integer numeroConta;
    private String nomeTitular;
    private Double saldo=0.0;
    private final Double LIMITE_SAQUE = 300.00;

    public ContaCorrente(Integer numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaCorrente(String nomeTitular, Integer numeroConta) {
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return LIMITE_SAQUE;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    //Metodo para Deposito
    public void depositar(Double valor){
        saldo += valor;
    }

    //Método para saque
    public void sacar(Double valor){
        //As mensagens de erro se encontram dentro do método
        if(valor > saldo){
            throw new ErroSaque("Sem saldo suficiente");
        }
        if(valor > LIMITE_SAQUE){
            throw new ErroSaque("Valor excede o limite para saque");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Dados da Conta:\n" +
                "Titular da conta:" + nomeTitular +
                "\nConta: " + numeroConta +
                "\nSaldo: " + String.format("%.2f", saldo) +
                "\nLimite de Saque: "+getLimiteSaque();
    }
}
