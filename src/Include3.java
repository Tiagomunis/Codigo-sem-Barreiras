import java.util.Scanner;

public class Include3 {


    public class Revisao {

        public static void banana() {
            // para i = 0
            // até i < 10
            // i = i + 1

            String input = "Banana";

            for (int i = 0; i <= input.length(); i++) {
                for (int j = 0; j < input.length(); j++) {
                    int posicao;
                    if (j + i > input.length() - 1) {
                        posicao = input.length() - i - j;

                        if (posicao < 0) {
                            posicao *= -1;
                        }

                    } else {
                        posicao = j + i;
                    }
                    System.out.print(input.charAt(posicao));
                }
                System.out.println();
            }
        }


        public static void bananaSubStr() {
            String input = "Banana";
            for (int i = 0; i <= input.length(); i++) {
                System.out.println(input.substring(i) + input.substring(0, i));
            }

            System.out.println("--- By Sergio");

            for (int i = 0; i <= input.length(); i++) {
                System.out.println(input.substring(input.length() - i) + input.substring(0, input.length() - i));
            }
        }


        public static void whileEhDoWhile() {
            var condicao = true;

            Scanner scanner = new Scanner(System.in);


            // Não cheira bem.
            for (; condicao; ) {
                System.out.println("com for");
                System.out.println("condicao verdadeira");
                System.out.println("deseja interromper a execução do programa? [s] ou [n]");

                if (scanner.nextLine().charAt(0) == 's') {
                    condicao = false;
                }
            }


            while (condicao) {
                System.out.println("condicao verdadeira");
                System.out.println("deseja interromper a execução do programa? [s] ou [n]");

                if (scanner.nextLine().charAt(0) == 's') {
                    condicao = false;
                }
            }

            do {
                System.out.println("condicao verdadeira");
                System.out.println("deseja interromper a execução do programa? [s] ou [n]");

                if (scanner.nextLine().charAt(0) == 's') {
                    condicao = false;
                } else {
                    condicao = true;
                }
            } while (condicao);

            scanner.close();
        }


        public static void comparacaoObjetoVsValor() {
            // Objeto comparamos com .equals
            // Valor comparamos com ==

            try (Scanner in = new Scanner(System.in)) {


                System.out.println("Comparação de string igual de forma incorreta");
                System.out.println("asd" == "asd");
                System.out.println(System.identityHashCode("asd"));
                System.out.println(System.identityHashCode("asd"));
                // Aqui os resultados são iguais pq o java colocou todos os ASDs apontando para o mesmo objeto


                System.out.println("Digite a primeira string");
                var str1 = in.next();
                System.out.println("Digite a segunda string");
                var str2 = in.next();

                if (str1.equals(str2)) {
                    System.out.println("Essas string são iguais");
                } else {
                    System.out.println("Essas string são diferentes");
                }

                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));

                System.out.println("Digite o primeiro número");
                Integer int1 = in.nextInt();
                System.out.println("Digite o segundo número");
                Integer int2 = in.nextInt();

                // Boxing e unboxing
                int a = 1;
                Integer b = a;

                int c = b;


                if (int1 == int2) {
                    System.out.println("São iguais");
                }

                // Fim boxing e unboxing

            }
        }

        public static void switchCase() {
            var inteira = "asd";

            switch (inteira) {
                case "asd":
                    System.out.println("Você escolheu o 0");
                    break;
                case "qwert":
                    System.out.println("Você escolheu o 1");
                    break;
                default:
                    System.out.println("Você escolheu algo que eu não sei o que é");
            }

            //Enhanced switch
            switch (inteira) {
                case "asd" -> System.out.println("Você escolheu o 0");
                case "qwert" -> System.out.println("Você escolheu o 1");
                default -> System.out.println("Você escolheu algo que eu não sei o que é");
            }
        }

        public static void main(String[] args) {
            switchCase();
        }

    }
}


