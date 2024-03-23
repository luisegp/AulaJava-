import java.util.Scanner;
public class Exercicio17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double n1 = leitor.nextDouble();

        System.out.println("Digite o peso 1");
        double p1 = leitor.nextDouble();

        System.out.println("Digite a nota 2");
        double n2 = leitor.nextDouble();

        System.out.println("Digite o peso 2");
        double p2 = leitor.nextDouble();

        System.out.println("Digite a nota 3");
        double n3 = leitor.nextDouble();
        
        System.out.println("Digite o peso 3");
        double p3 = leitor.nextDouble();

        double media = (n1 * p1 + n2 * p2 + n3 * p3) / p1 * p2 * p3;

        System.out.println("A média harmonica dos valores dados é: " + media);
        
        leitor.close();
    }
}
