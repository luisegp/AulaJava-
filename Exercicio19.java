import java.util.Scanner;
public class Exercicio19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = leitor.nextDouble();

        System.out.println("Digite a altura");
        double altura = leitor.nextDouble();

        double vol = 3.14*raio*raio*altura;

        System.out.println("O volume do cilindro é: " + vol);
        
        leitor.close();
    }
}
