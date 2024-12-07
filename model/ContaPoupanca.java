package model;

public class ContaPoupanca extends Conta {

        public ContaPoupanca(int numero, String nome, double saldo) {
            super(numero, nome, saldo);
        }

        public void reajuste(double percentual){
            double saldoAtual = this.getSaldo();
            double novoSaldo = saldoAtual + (saldoAtual * (percentual / 100));
            this.setSaldo(novoSaldo);
        }
}

