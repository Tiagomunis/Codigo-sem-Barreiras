import java.lang.module.ModuleDescriptor;
import java.util.Scanner;

public class Exercio2 {



            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            float va = -1; // vale alimentação
            float vt = -1; // vale transporte
            float vr = -1; // vale refeição
            float gasto;
            int opcao, pessoa;
            boolean sair, resetar;
            resetar = true;


            while (resetar) {

                System.out.printf("Olá, informe o saldo dos seguintes cartões:");

                while (va < 0) {
                    System.out.printf("%nVale Alimentação: ");
                    va = input.nextFloat();
                }

                while (vt < 0) {
                    System.out.printf("%nVale Transporte: ");
                    vt = input.nextFloat();
                }

                while (vr < 0) {
                    System.out.printf("%nVale Refeição: ");
                    vr = input.nextFloat();
                }

                System.out.printf("%nObrigado! O seu saldo atual é:" +
                        "%nVale Alimentação: R$%.2f" +
                        "%nVale Transporte: R$%.2f" +
                        "%nVale Refeição: R$%.2f", va, vt, vr);

                sair = true;

                while (sair) {
                    System.out.printf("%n-------------------------------" +
                            "%nEscolha qual cartão você deseja usar:" +
                            "%n1 - Vale Alimentação" +
                            "%n2 - Vale Transporte" +
                            "%n3 - Vale Refeição" +
                            "%n8 - Resetar o programa" +
                            "%n9 - Ver saldos" +
                            "%n0 - Encerrar programa" +
                            "%n%nOpção escolhida: ");
                    opcao = input.nextInt();

                    if (opcao == 1) {
                        System.out.printf("%n-------------------------------" +
                                "%nVale alimentação escolhido. Seu saldo atual é de R$%.2f" +
                                "%nDigite o valor da compra: R$", va);
                        gasto = input.nextFloat();
                        if (gasto > va) {
                            System.out.printf("%n-------------------------------" +
                                    "%nERRO! Seu saldo não comporta esta compra" +
                                    "%nSeu saldo no Vale Alimentação é de R$%.2f" +
                                    "%nSeu saldo no Vale Refeição é de R$%.2f" +
                                    "%nSeu saldo no Vale Transporte é de R$%.2f ", va, vr, vt);
                        } else {
                            va -= gasto;
                            System.out.printf("%nSeu saldo no vale alimentação agora é de R$ %.2f", va);
                        }
                    } else if (opcao == 2) {
                        System.out.printf("%n-------------------------------" +
                                "%nVale transporte escolhido. Seu saldo atual é de R$%.2f" +
                                "%nDigite o valor da compra: R$", vt);
                        gasto = input.nextFloat();
                        if (gasto > vt) {
                            System.out.printf("%n-----------------------------" +
                                    "%nERRO! Seu saldo não comporta esta compra" +
                                    "%nSeu saldo no Vale Transporte é de R$%.2f ", vt);
                        } else {
                            vt -= gasto;
                            System.out.printf("%n-----------------------------" +
                                    "%nSeu saldo no vale transporte agora é de R$%.2f", vt);
                        }
                    } else if (opcao == 3) {
                        System.out.printf("%n-------------------------------" +
                                "%nVale refeição escolhido. Seu saldo atual é de R$%.2f" +
                                "%nDigite o valor da compra: R$", vr);
                        gasto = input.nextFloat();
                        if (gasto > vr) {
                            System.out.printf("%n-----------------------------" +
                                    "%nERRO! Seu saldo não comporta esta compra" +
                                    "%nSeu saldo no Vale refeição é de R$ %.2f ", vr);
                        } else {
                            vr -= gasto;
                            System.out.printf("%n-----------------------------" +
                                    "%nSeu saldo no vale refeição agora é de R$%.2f", vr);
                        }
                    } else if (opcao == 8) {
                        sair = false;
                        va = 0;
                        vt = 0;
                        vr = 0;
                    } else if (opcao == 9) {
                        System.out.printf("%n-------------------------------" +
                                "%nOs saldos disponíves em seus cartões:" +
                                "%nVale Alimentação: R$%.2f" +
                                "%nVale Transporte: R$%.2f" +
                                "%nVale Refeição: R$%.2f", va, vt, vr);
                    } else if (opcao == 0) {
                        System.out.printf("%n-------------------------------" +
                                "%nObrigado por utilizar o programa. Até logo!");
                        sair = false;
                        resetar = false;
                    } else {
                        System.out.printf("%n-------------------------------" +
                                "%nOpção inválida, tente novamente. ");
                    }
                }
            }
        }

    }

