import java.util.Scanner;

public class Exercio1 {

    public static void banana() {
        /*
        * Escreva um programa em Java que permita a entrada de uma String S e então exiba na
        * tela todas as possíveis rotações à esquerda de S. Por exemplo, se o usuário digitar
        * "Banana", o programa deve exibir:
        "Banana"
        "ananaB"
        "nanaBa"
        "anaBan"
        "naBana"
        "aBanan"
        "Banana"
         */

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        char usuarioQuerExecutar = 's';

        do {

            System.out.println("Digite a palavra que você quer rotacionar:");
            String str = in.next();


            int tamanhoString = str.length();

            StringBuilder strDeSaida = new StringBuilder();

            for (int i = 0; i < tamanhoString; i++) {
                strDeSaida.append(str.charAt(i));
                for (int j = i + 1; j < tamanhoString + i; j++) {
                    strDeSaida.append(str.charAt(j > tamanhoString - 1 ? j - tamanhoString : j));
                    // If ternário
                }
                strDeSaida.append("\n");

            }
            strDeSaida.append(str);

            System.out.println(strDeSaida);

            System.out.println("Deseja rotacionar mais alguma palavra? [s, n]");
            usuarioQuerExecutar = in.next().charAt(0);


        } while (usuarioQuerExecutar == 's');
        in.close();

    }

    public static void main(String[] args) {
        banana();
    }
}
