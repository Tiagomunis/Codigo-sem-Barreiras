import java.util.Scanner;

public class Erxecio2 {

    public class Exercicio_02 {
        public static void main(String[] args) {


            Scanner teclado = new Scanner(System.in);

            int num, fib[];
            boolean test;
            test = true;

            System.out.println("Digitar um numero inteiro positivo");
            num = teclado.nextInt();
            while (test == true) {
                if (num < 0) {
                    System.out.println("Número digitado indevido");
                    System.out.println("Digitar um numero inteiro");
                    num = teclado.nextInt();
                } else {
                    test = false;
                }
            }

            fib = new int[num + 1];
            for (int i = 0; i < num + 1; i++) {
                if (i == 0) {
                    fib[i] = 0;
                    System.out.println(fib[i]);
                } else if (i == 1) {
                    fib[i] = 1;

                    System.out.println(fib[i]);
                } else {
                    fib[i] = fib[i - 1] + fib[i - 2];

                    System.out.println(fib[i]);
                }

            }

            //System.out.println("O resultado do Fibonacci é: "+fib);

            teclado.close();}}





