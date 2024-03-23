import java.util.Scanner;

public class Ex11 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }
        
        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        
        System.out.println("O produto escalar entre os dois vetores é: " + produtoEscalar);
        
        scanner.close();
    }
}
