import java.util.Scanner;
public class Exercicio15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as coordenadas de p1 (X1)");
        double x1 = leitor.nextDouble();

        System.out.println("Digite as coordenadas de p1 (Y1)");
        double y1 = leitor.nextDouble();

        System.out.println("Digite as coordenadas de p2 (X2)");
        double x2 = leitor.nextDouble();

        System.out.println("Digite as coordenadas de p2 (Y2)");
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("Distância entre dois pontos: " + distancia);
        
        leitor.close();
    }
}
