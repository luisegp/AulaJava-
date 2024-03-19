import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int b = leitor.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int c = leitor.nextInt();

        // Ordenação dos valores
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        // Exibição dos valores em ordem crescente
        System.out.println("Os valores em ordem crescente são: " + a + ", " + b + ", " + c);

        leitor.close();
    }
}
