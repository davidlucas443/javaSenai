package contaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sacar;

        ContaPessoaJuridica pj = new ContaPessoaJuridica(0, 0, null, 0,20.0,1.5);
        ContaPoupanca poupanca = new ContaPoupanca(0, 0, null, 0);
        ContaCorrente corrente = new ContaCorrente(0, 0, null, 0, 12.0);

        System.out.println("Olá, Bem-Vindo a sua Conta Bancária");

        System.out.println("Qual o tipo da sua conta ?");

        while (true) {

            System.out.println("1. Poupança");
            System.out.println("2. Corrente");
            System.out.println("3. Jurídica");

            int opc3 = sc.nextInt();


            switch (opc3) {

                case 1:

                    while (true) {

                        System.out.println("Você Deseja :");
                        System.out.println("1. Cadastrar-se");
                        System.out.println("2. Ver Saldo");
                        System.out.println("3. Depositar");
                        System.out.println("4. Sacar");
                        System.out.println("5. Sair");
                        int opc = sc.nextInt();

                        switch (opc) {

                            case 1:
                                System.out.println("Qual o número da sua conta ?");
                                poupanca.setNumero(sc.nextInt());

                                System.out.println("Qual o número da sua agência ?");
                                poupanca.setAgencia(sc.nextInt());

                                System.out.println("Qual nome do titular da conta ?");
                                poupanca.setTitular(sc.next());
                                break;


                            case 2:

                                System.out.printf("Seu saldo é de R$ %.2f%n", poupanca.getSaldo());
                                break;

                            case 3:

                                System.out.println("Quanto você deseja depositar ?");
                                poupanca.setSaldo(sc.nextDouble());

                                System.out.printf("Seu saldo é de R$ %.2f%n" , poupanca.getSaldo());

                                break;

                            case 4:

                                System.out.println("Quanto você deseja sacar ?");
                                sacar = sc.nextInt();

                                while (true) {

                                    if (sacar <= poupanca.getSaldo()) {

                                        poupanca.setSaldo((poupanca.getSaldo() - sacar - pj.getTaxa()));
                                        System.out.printf("Seu saldo é de R$ %.2f%n" , poupanca.getSaldo());
                                        break;

                                    } else {
                                        System.out.println("Valor invalido, tente novamente");

                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Obrigado por usar nossos servicos.");
                                return;


                            default:
                                System.out.println("Selecione uma opção válida");
                        }

                    }
                case 2:

                    while (true) {

                        System.out.println("Você Deseja :");
                        System.out.println("1. Cadastrar-se");
                        System.out.println("2. Ver Saldo");
                        System.out.println("3. Depositar");
                        System.out.println("4. Sacar");
                        System.out.println("5. Sair");
                        int opc = sc.nextInt();

                        switch (opc) {

                            case 1:
                                System.out.println("Qual o número da sua conta ?");
                                corrente.setNumero(sc.nextInt());

                                System.out.println("Qual o número da sua agência ?");
                                corrente.setAgencia(sc.nextInt());

                                System.out.println("Qual nome do titular da conta ?");
                                corrente.setTitular(sc.next());
                                break;


                            case 2:

                                System.out.printf("Seu saldo é de R$ %.2f%n" , corrente.getSaldo());
                                break;

                            case 3:

                                System.out.println("Quanto você deseja depositar ?");
                                corrente.setSaldo(sc.nextDouble());

                                corrente.setSaldo(corrente.getSaldo() - corrente.getTarifaCC());
                                System.out.printf("Seu saldo é de de R$ %.2f%n" , corrente.getSaldo());
                                System.out.printf("Foram descontados R$ %.2f%n",corrente.getTarifaCC());
                                System.out.println("(Da tarifa mensal de conta corrente)");
                                break;

                            case 4:

                                System.out.println("Quanto você deseja sacar ?");
                                sacar = sc.nextInt();

                                while (true) {

                                    if (sacar <= corrente.getSaldo()) {

                                        corrente.setSaldo((corrente.getSaldo() - sacar));
                                        System.out.printf("Seu saldo é de R$ %.2f%n" , corrente.getSaldo());
                                        break;

                                    } else {
                                        System.out.println("Valor invalido, tente novamente");

                                    }
                                }

                                break;

                            case 5:
                                System.out.println("Obrigado por usar nossos servicos.");
                                return;


                            default:
                                System.out.println("Selecione uma opção válida");
                        }

                    }
                case 3:

                    while (true) {

                        System.out.println("Você Deseja :");
                        System.out.println("1. Cadastrar-se");
                        System.out.println("2. Ver Saldo");
                        System.out.println("3. Depositar");
                        System.out.println("4. Sacar");
                        System.out.println("5. Sair");
                        int opc = sc.nextInt();

                        switch (opc) {

                            case 1:
                                System.out.println("Qual o número da sua conta ?");
                                pj.setNumero(sc.nextInt());

                                System.out.println("Qual o número da sua agência ?");
                                pj.setAgencia(sc.nextInt());

                                System.out.println("Qual nome do titular da conta ?");
                                pj.setTitular(sc.next());
                                break;


                            case 2:

                                System.out.printf("Seu saldo é de R$ %.2f%n" , pj.getSaldo());
                                break;



                            case 3:

                                System.out.println("Quanto você deseja depositar ?");
                                pj.setSaldo(sc.nextDouble());

                                pj.setSaldo(pj.getSaldo() - pj.getTarifaPj());

                                System.out.printf("Seu saldo é de R$ %.2f%n" , pj.getSaldo());

                                System.out.printf("Foram descontados R$ %.2f%n" , (pj.getTarifaPj()));
                                System.out.println("(Da tarifa mensal de conta Pessoa Juridica)");
                                break;

                            case 4:

                                System.out.println("Quanto você deseja sacar ?");
                                sacar = sc.nextDouble();

                                while (true) {

                                    if (sacar <= pj.getSaldo()) {

                                        pj.setSaldo(pj.getSaldo() - sacar - pj.getTaxa());
                                        System.out.printf("Seu saldo é de R$ %.2f%n" , pj.getSaldo());
                                        System.out.printf("Foram descontados R$ %.2f%n" , pj.getTaxa());
                                        System.out.println("(Da taxa por saque)");

                                        break;

                                    }
                                    else {
                                        System.out.println("Valor invalido, tente novamente");


                                    }
                                    break;
                                }
                                break;

                            case 5:
                                System.out.println("Obrigado por usar nossos servicos.");
                                return;

                            default:
                                System.out.println("Selecione uma opção válida");
                        }
                    }
                        default:
                            System.out.println("Selecione uma opção válida");

                }
            }
        }
    }
