package view;


import model.Conta;
import model.ContaEspecial;
import model.ContaPoupanca;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n----QUESTÃO 1----\n");
        ContaPoupanca contaPoupanca = new ContaPoupanca(123, "João", 1000.0);

        System.out.println("Saldo antes do reajuste: " + contaPoupanca.getSaldo());
        contaPoupanca.reajuste(10);
        System.out.println("Saldo após o reajuste: " + contaPoupanca.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial(123, "Pedro", 3000, 500);
        contaEspecial.saque(1000);
        contaEspecial.saque(400);
        System.out.println("Saldo após o saque: " + contaEspecial.getSaldo());


        System.out.println("\n----QUESTÃO 2----\n");
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;
        int opcao;

        do {
            System.out.println("\nMenu:\n" +
                    "1. Abrir uma conta\n" +
                    "2. Depósito\n" +
                    "3. Saque\n" +
                    "4. Saldo\n" +
                    "5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\nEscolha o tipo de conta:\n" +
                            "1. Conta Comum\n" +
                            "2. Conta Poupança\n" +
                            "3. Conta Especial");
                    int tipo = scanner.nextInt();
                    if (tipo == 1){
                        conta = new Conta(123, "Maria", 400);
                    }
                   if (tipo == 2) {
                        conta = new ContaPoupanca(123, "João", 1000.0);
                    } else {
                        conta = new ContaEspecial(123, "Maria", 1000.0, 500.0);
                    }
                    System.out.println("Conta aberta com sucesso!");
                    System.out.println("Número da conta: " + conta.getNumero() + "\nNome: " + conta.getNome() + "\nSaldo: " + conta.getSaldo());
                }

                case 2 -> {
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada ainda!");
                    } else {
                        System.out.print("Digite o valor do depósito: ");
                        double valor = scanner.nextDouble();
                        conta.depositar(valor);
                        System.out.println("Depósito realizado com sucesso!");
                    }
                }

                case 3 -> {
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada ainda!");
                    } else {
                        System.out.print("Digite o valor do saque: ");
                        double valor = scanner.nextDouble();
                        conta.saque(valor);
                    }
                }

                case 4 -> {
                    if (conta == null) {
                        System.out.println("Nenhuma conta criada ainda!");
                    } else {
                        System.out.println("Saldo atual: " + conta.getSaldo());
                    }
                }

                case 5 -> System.out.println("Encerrando o programa...");

                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();

    }
}

