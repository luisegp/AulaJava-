import java.util.Scanner;
public class Exercicio10 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 5: ");
        int num = leitor.nextInt();

        if (num > 5 && num < 0) {
            System.out.println("O número informado está inválido");
        }else{
            if (num == 1){
                System.out.println("Um");
            }else if (num == 2){
                System.out.println("Dois");
            }else if (num == 3){
                System.out.println("Três");
            }else if (num == 4){
                System.out.println("Quatro");
            }else if (num == 5){
                System.out.println("Cinco");
            }
        }

        leitor.close();
    }
}
