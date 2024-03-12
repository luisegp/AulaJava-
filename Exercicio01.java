import java.util.Scanner;

public class Exercicio01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        float num1 = leitor.nextFloat();

        if(num1 > 10){
            System.out.println("O número informado é maior que 10");
        }
        else{
            System.out.println("O número informado é menor ou igual a 10.");
        }


        leitor.close();
    }
}
