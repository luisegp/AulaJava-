import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o operador aritmético (+, -, *, /): ");
        char operador = leitor.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador não definido.");
                break;
        }

        leitor.close();
    }
}
