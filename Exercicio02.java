import java.util.Scanner;
public class Exercicio02 {
   public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num1 = leitor.nextInt();

        System.out.println("Informe outro número: ");
        int num2 = leitor.nextInt();
        
        int resultado = num1 + num2;

        System.out.println("A soma dos números informados é: " + resultado);

        leitor.close();
   } 
}
