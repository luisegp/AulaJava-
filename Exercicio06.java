import java.util.Scanner;
public class Exercicio06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus celsius: ");
        int celsius = leitor.nextInt();
        float fahr = (9*celsius+160)/5;

        System.out.println("A quantidade de graus celsius inserido é " + fahr + "graus fahrenheit");

        leitor.close();
    }
}
