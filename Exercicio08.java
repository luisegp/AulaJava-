import java.util.Scanner;
public class Exercicio08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = leitor.nextInt();

        if (num >= 50) {
            System.out.println("O número informado é maior ou igual a 50");
        }else{
            System.out.println("O número informado é menor que 50");
        }

        leitor.close();
    }
}
