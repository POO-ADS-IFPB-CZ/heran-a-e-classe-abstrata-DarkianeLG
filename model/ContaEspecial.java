package model;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, String nome, double saldo, double limite) {
        super(numero, nome, saldo);
        this.limite = limite;
    }

    public void saque (double valor){
        double saldoAtual = getSaldo();
        if(valor <= saldoAtual && valor <= limite){
            saldoAtual = saldoAtual - valor;
            setSaldo(saldoAtual);
            System.out.println("Saque realizado com sucesso.");
        }else{
            System.out.println("Erro! Saldo ou limite insuficiênte.");
        }
    }
}
