import java.util.Scanner;
public class Exercicio18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double n1 = leitor.nextDouble();

        System.out.println("Digite a nota 2");
        double n2 = leitor.nextDouble();

        System.out.println("Digite a nota 3");
        double n3 = leitor.nextDouble();

        double media = 3/(1/n1 + 1/n2 + 1/n3);

        System.out.println("A média harmonica dos valores dados é: " + media);
        
        leitor.close();
    }
}
