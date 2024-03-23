import java.util.Scanner;
public class Exercicio14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos fazer uma PA. Informe o valor de do A1: ");
        int a1 = leitor.nextInt();

        System.out.println("Infome o valor de N: ");
        int n = leitor.nextInt();

        System.err.println("Informe o valor de R: ");
        int r = leitor.nextInt();

        int pa = a1+ (n-1)*r;

        System.out.println("O valor de An da progressão é: " + pa);

        leitor.close();
    }
}
