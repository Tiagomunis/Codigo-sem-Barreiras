import java.util.Scanner;

public class CartaoNewgen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // iniciando a função Scanner

        // Declarando as variais globais do sistemas
        float gasto, valor;
        int opcao, pessoa, senha;
        // inicializando algumas variáveis
        float va = -1; // vale alimentação o valor atribuido ser negativo é a forma de iniciar setando os valores dos cartões
        float vt = -1; // vale transporte
        float vr = -1; // vale refeição
        boolean sair = false;
        boolean administrador = false;
        boolean resetar = true;
        boolean admpessoa = true;

        // inicializando um loop resetar
        while (resetar) {

            // Mostra ao usuário os tipos de cartão disponivel e solicita definir o saldo de cada cartão
            System.out.print("Olá, informe o saldo dos seguintes cartões:");

            // Verificação se o valor e negativo s irá sair quando digitar um valor positivo ou zero
            while (va < 0) {
                System.out.printf("%nVale Alimentação: R$");
                // a variável va recebe o valor digitado pelo usuário
                va = input.nextFloat();
            }

            while (vt < 0) {
                System.out.print("Vale Transporte: R$");
                vt = input.nextFloat();
            }

            while (vr < 0) {
                System.out.print("Vale Refeição: R$");
                vr = input.nextFloat();
            }

            // inicia o loop para a escolha do tipo do usuário
            while (admpessoa) {
                // Solicita ao usuário escolhar se ele é administrador ou usuário do cartão
                System.out.printf("%n-------------------------------" +
                        "%nEscolha a sua opção:" +
                        "%n1 - Administrador" +
                        "%n2 - Usuário" +
                        "%n%nOpção desejada: ");
                pessoa = input.nextInt();

                // Verificação se o usuário é um adminstrador atraves de senha
                if (pessoa == 1) {
                    // Solicitação para digitar a senha
                    System.out.print("Digite a senha [0 para ir para usuário]: ");
                    senha = input.nextInt();
                    // Verificação se a senha está correta
                    if (senha == 12345) {
                        System.out.print("Bem vindo, administrador.");
                        administrador = true; // O menum do adminstrador esta ativo
                        admpessoa = false; // o loop da seleção de usuário está desativado
                        sair = true;// O loop para encerrar o programa está ativo esta ativo
                    }
                    //  Verificação se o usuário que encerrar o programa
                    else if (senha == 0) {
                        sair = true;
                    }
                    else {
                        boolean sen = true;

                        // O loop para as tentativas de erros
                        while (sen) {
                            System.out.printf("SENHA INVÁLIDA." +
                                    "%nTente novamente [0 para ir para usuário]: ");
                            senha = input.nextInt();
                            // validação da senha
                            if (senha == 12345) {
                                sen = false;
                                admpessoa = false;
                                administrador = true;
                                resetar = false;
                                sair = true;
                            } else if (senha == 0) {
                                sen = false;
                                sair = true;
                            }
                        }
                    }

                } else if (pessoa == 2) {
                    admpessoa = false;
                    sair = true;

                } else {
                    System.out.printf("%n-------------------------------" +
                            "%nOpção inválida, tente novamente.%n ");
                }


                if (sair) {
                    System.out.printf("%n-------------------------------" +
                            "%nBem vindo! O seu saldo atual é:" +
                            "%nVale Alimentação: R$%.2f" +
                            "%nVale Transporte: R$%.2f" +
                            "%nVale Refeição: R$%.2f", va, vt, vr);
                }

                while (sair) {

                    while (administrador) {
                        System.out.printf("%n-------------------------------" +
                                "%n6 - Trocar privilégio" +
                                "%n7 - Acrescentar saldo" +
                                "%n8 - Resetar o programa" +
                                "%n9 - Ver saldo" +
                                "%n0 - Encerrar programa" +
                                "%nOpção escolhida: ");
                        opcao = input.nextInt();

                        if (opcao == 6) {
                            sair = false;
                            admpessoa = true;
                            administrador = false;
                        } else if (opcao == 7) {
                            System.out.printf("%n-----------------------------" +
                                    "%nEscolha qual cartão acrescentar saldo:" +
                                    "%n1 - Vale alimentação" +
                                    "%n2 - Vale transporte" +
                                    "%n3 - Vale refeição" +
                                    "%nOpção desejada: ");
                            opcao = input.nextInt();

                            if (opcao == 1) {
                                System.out.printf("%n-----------------------------" +
                                        "%nValor a acrescentar no vale alimentação: R$");
                                valor = input.nextInt();
                                while (valor < 0) {
                                    System.out.print("Favor inserir um valor positivo para acrescentar: R$");
                                    valor = input.nextInt();
                                }
                                va += valor;
                                System.out.printf("Agora o saldo de vale alimentação é: R$%.2f", va);
                            } else if (opcao == 2) {

                                System.out.printf("%n-----------------------------" +
                                        "%nValor a acrescentar no vale transporte: R$");
                                valor = input.nextInt();
                                while (valor < 0) {
                                    System.out.print("Favor inserir um valor positivo para acrescentar: R$");
                                    valor = input.nextInt();
                                }
                                vt += valor;
                                System.out.printf("Agora o saldo de vale transporte é: R$%.2f", vt);
                            } else if (opcao == 3) {

                                System.out.printf("%n-----------------------------" +
                                        "%nValor a acrescentar no vale refeição: R$");
                                valor = input.nextInt();
                                while (valor < 0) {
                                    System.out.print("Favor inserir um valor positivo para acrescentar: R$");
                                    valor = input.nextInt();
                                }
                                vr += valor;
                                System.out.printf("Agora o saldo de vale refeição é: R$%.2f", vr);
                            } else {
                                System.out.printf("%n-------------------------------" +
                                        "%nOpção inválida, tente novamente. ");
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
                            administrador = false;
                            break;
                        } else {
                            System.out.printf("%n-------------------------------" +
                                    "%nOpção inválida, tente novamente. ");
                        }

                    }

                    while (!administrador && sair) {
                        System.out.printf("%n-------------------------------" +
                                "%nEscolha qual cartão você deseja usar:" +
                                "%n1 - Vale Alimentação" +
                                "%n2 - Vale Transporte" +
                                "%n3 - Vale Refeição" +
                                "%n6 - Troca privilégio" +
                                "%n9 - Ver saldos" +
                                "%n0 - Encerrar programa" +
                                "%n%nOpção escolhida: ");
                        opcao = input.nextInt();

                        if (opcao == 1) {
                            System.out.printf("%n-------------------------------" +
                                    "%nVale alimentação escolhido. Seu saldo atual é de R$%.2f" +
                                    "%nDigite o valor da compra: R$", va);
                            gasto = input.nextFloat();
                            while (gasto < 0) {
                                System.out.print("Favor inserir um valor positivo para debitar: R$");
                                gasto = input.nextInt();
                            }

                            if (gasto > va) {
                                System.out.printf("%n-------------------------------" +
                                        "%nERRO! Seu saldo não comporta esta compra" +
                                        "%nSeu saldo no Vale Alimentação é de R$%.2f", va);
                            } else {
                                va -= gasto;
                                System.out.printf("%nSeu saldo no vale alimentação agora é de R$ %.2f", va);
                            }
                        } else if (opcao == 2) {
                            System.out.printf("%n-------------------------------" +
                                    "%nVale transporte escolhido. Seu saldo atual é de R$%.2f" +
                                    "%nDigite o valor da compra: R$", vt);
                            gasto = input.nextFloat();
                            while (gasto < 0) {
                                System.out.print("Favor inserir um valor positivo para debitar: R$");
                                gasto = input.nextInt();
                            }
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
                            while (gasto < 0) {
                                System.out.print("Favor inserir um valor positivo para debitar: R$");
                                gasto = input.nextInt();
                            }
                            if (gasto > vr) {
                                System.out.printf("%n-----------------------------" +
                                        "%nERRO! Seu saldo não comporta esta compra" +
                                        "%nSeu saldo no Vale refeição é de R$ %.2f ", vr);
                            } else {
                                vr -= gasto;
                                System.out.printf("%n-----------------------------" +
                                        "%nSeu saldo no vale refeição agora é de R$%.2f", vr);
                            }

                        } else if (opcao == 6) {
                            sair = false;
                            admpessoa = true;
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
                            admpessoa = false;
                        } else {
                            System.out.printf("%n-------------------------------" +
                                    "%nOpção inválida, tente novamente. ");
                        }
                    }
                }
            }
        }
        input.close(); // encerrando a função Scanner
    }
}
