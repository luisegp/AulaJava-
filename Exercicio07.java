import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = leitor.nextInt();

        if (num >= 100 && num <=200) {
            System.out.println("O número informado está entre 100 e 200");
        }else{
            System.out.println("O número informado é menor que 100 ou maior que 200");
        }

        leitor.close();
    }
}
