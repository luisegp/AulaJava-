import java.util.Scanner;
public class Exercicio12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = leitor.nextInt();

        // Validando o número do mês
        if (numeroMes >= 1 && numeroMes <= 12) {
            String mes;
            switch (numeroMes) {
                case 1:
                    mes = "Janeiro";
                    break;
                case 2:
                    mes = "Fevereiro";
                    break;
                case 3:
                    mes = "Março";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Maio";
                    break;
                case 6:
                    mes = "Junho";
                    break;
                case 7:
                    mes = "Julho";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Setembro";
                    break;
                case 10:
                    mes = "Outubro";
                    break;
                case 11:
                    mes = "Novembro";
                    break;
                case 12:
                    mes = "Dezembro";
                    break;
                default:
                    mes = "Inválido";
                    break;
            }
            System.out.println("O mês correspondente é: " + mes);
        } else {
            System.out.println("Número de mês inválido. Por favor, digite um número de mês válido (1 a 12).");
        }

        leitor.close();
    }
}

