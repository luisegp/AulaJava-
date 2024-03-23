import java.util.Scanner; 

public class Programa {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite qual exercício deseja executar: ");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Executando exercicio 1...");
                Exercicio01.executar();
                break;
            case 2:
                System.out.println("Executando exercicio 2...");
                break;
            
            case 3:
                System.out.println("Executando exercicio 3...");
                break;
            case 4:
                System.out.println("Executando exercicio 4...");
                break;
                        
            case 5:
                System.out.println("Executando exercicio 5...");
                break;
            case 6:
                System.out.println("Executando exercicio 6...");
                break;
            
            case 7:
                System.out.println("Executando exercicio 7...");
                break;
            case 8:
                System.out.println("Executando exercicio 8...");
                break;
                        
            case 9:
                System.out.println("Executando exercicio 9...");
                break;
              
            case 10:
                System.out.println("Executando exercicio 10...");
                break;
            case 11:
                System.out.println("Executando exercicio 11...");
                break;
            case 12:
                System.out.println("Executando exercicio 12...");
                break;
            
            case 13:
                System.out.println("Executando exercicio 13...");
                break;
            case 14:
                System.out.println("Executando exercicio 14...");
                break;
                        
            case 15:
                System.out.println("Executando exercicio 15...");
                break;
            case 16:
                System.out.println("Executando exercicio 16...");
                break;
            
            case 17:
                System.out.println("Executando exercicio 17...");
                break;
            case 18:
                System.out.println("Executando exercicio 18...");
                break;
                        
            case 19:
                System.out.println("Executando exercicio 19...");
                break;
              
            case 20:
                System.out.println("Executando exercicio 20...");
                break;
            default:
            System.out.println("Opção inválida! Digite uma opção de 1 a 20");
                break;
        }while (opcao != 0);

        leitor.close();
    }
}
