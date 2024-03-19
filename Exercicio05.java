import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o numero A: ");
        int num1 = leitor.nextInt();

        System.out.println("Informe o número de B");
        int num2 = leitor.nextInt();

        System.out.println("O primeiro número informado é: " + num1 + "O segundo é: " + num2);

        int aux = num1;
        num1 = num2;
        num1 = aux;

        System.out.println("Com os valores trocados, o súmeros de A e B informados são: " + num1 + num2);

        leitor.close();
    }
}
