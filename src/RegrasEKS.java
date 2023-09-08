//import java.text.DecimalFormat;
import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

         int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods /
         podsPorNode);

         int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods /
         podsPorServidor);

         // Também é possível chegar ao mesmo resultado utilizando DecimalFormat
         //Double calculo = numeroTotalPods / 10.0;
        //Double formato = numeroTotalPods / 4.0;
        //DecimalFormat decimalFormat = new DecimalFormat("#");

        // int numeroMinimoNodes = Integer.valueOf(decimalFormat.format(calculo));

        // int numeroMinimoServidores = Integer.valueOf(decimalFormat.format(formato));

        // #############

        if (numeroTotalPods <= podsPorNode) {
            System.out.println("1.Recomendamos usar um unico node.");
        } else {

            System.out.println("1.Número minimo de nodes: " + numeroMinimoNodes);
        }
            System.out.println("1. Número minimo de servidores: " + numeroMinimoServidores);

        

        // Fechando o Scanner
        scanner.close();
    }
}
