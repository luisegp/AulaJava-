import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = leitor.nextInt();

        System.out.println("Informe um número: ");
        int num2 = leitor.nextInt();

        if (num == num2) {
            System.out.println("Os números informados são iguais");
        }else{
            if (num > num2) {
                System.out.println("Os números informados são diferentes, mas o primeiro é maior que o segundo");    
            }else{
                System.out.println("Os números informados são diferentes, mas o primeiro é menor que o segundo");
            }
        }

        leitor.close();
    }
}
