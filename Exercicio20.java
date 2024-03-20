import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de km/l seu carro faz");
        double n1 = leitor.nextDouble();

        System.out.println("Digite a quantidade de horas da viagem");
        double n2 = leitor.nextDouble();

        System.out.println("Digite a velocidade média da viagem");
        double n3 = leitor.nextDouble();

        double quant = (n2 * n3) / n1;

        System.out.println("A média dos valores dados é: " + quant);
        
        leitor.close();
    }
}
