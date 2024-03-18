import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1 = leitor.nextInt();

        System.out.println("Informe mais um número");
        int num2 = leitor.nextInt();

        if (num1 == num2) {
            System.out.println("Os números informados são iguais.");
        }else if(num1 > num2){
            System.out.println("O primeiro número informado é maior que o segundo");
        }else{
            System.out.println("O segundo número é maior");
        }

        leitor.close();
    }
}
