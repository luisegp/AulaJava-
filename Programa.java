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
                Exercicio02.executar();
                break;
            
            case 3:
                System.out.println("Executando exercicio 3...");
                Exercicio03.executar();
                break;
            case 4:
                System.out.println("Executando exercicio 4...");
                Exercicio04.executar();
                break;
                        
            case 5:
                System.out.println("Executando exercicio 5...");
                Exercicio05.executar();
                break;
            case 6:
                System.out.println("Executando exercicio 6...");
                Exercicio06.executar();
                break;
            
            case 7:
                System.out.println("Executando exercicio 7...");
                Exercicio07.executar();
                break;
            case 8:
                System.out.println("Executando exercicio 8...");
                Exercicio08.executar();
                break;
                        
            case 9:
                System.out.println("Executando exercicio 9...");
                Exercicio09.executar();
                break;
              
            case 10:
                System.out.println("Executando exercicio 10...");
                Exercicio10.executar();
                break;
            case 11:
                System.out.println("Executando exercicio 11...");
                Exercicio11.executar();
                break;
            case 12:
                System.out.println("Executando exercicio 12...");
                Exercicio12.executar();
                break;
            
            case 13:
                System.out.println("Executando exercicio 13...");
                Exercicio13.executar();
                break;
            case 14:
                System.out.println("Executando exercicio 14...");
                Exercicio14.executar();
                break;
                        
            case 15:
                System.out.println("Executando exercicio 15...");
                Exercicio15.executar();
                break;
            case 16:
                System.out.println("Executando exercicio 16...");
                Exercicio16.executar();
                break;
            
            case 17:
                System.out.println("Executando exercicio 17...");
                Exercicio17.executar();
                break;
            case 18:
                System.out.println("Executando exercicio 18...");
                Exercicio18.executar();
                break;
                        
            case 19:
                System.out.println("Executando exercicio 19...");
                Exercicio19.executar();
                break;
              
            case 20:
                System.out.println("Executando exercicio 20...");
                Exercicio20.executar();
                break;
            default:
            System.out.println("Opção inválida! Digite uma opção de 1 a 20");
                break;
        }while (opcao != 0);

        leitor.close();
    }
}
