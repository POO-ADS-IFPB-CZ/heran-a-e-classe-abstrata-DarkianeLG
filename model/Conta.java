package model;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar (double valor){
        saldo = saldo + valor;
        System.out.println("Deposito realizado com sucesso.");
    }

    public void saque (double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso.");
        }else{
            System.out.println("Erro! Saldo ou limite insuficiênte.");
        }
    }

}


