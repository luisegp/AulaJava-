import java.util.Scanner;
public class Exercicio04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.println("Informe o segundo número");
        int num2 = leitor.nextInt();

        int mult = num1 * num2, soma = num1 + num2, sub = num1 - num2;
        float div = num1 / num2;

        System.out.println("O resultado das operações com os números fornecidos é: Multiplicação: " + mult + 
        "Divisão: " + div + "Soma: " + soma + "Subtração: " + sub);

        leitor.close();
    }
}
