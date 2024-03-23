import java.util.Scanner;

public class Ex10 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
        }
        
       
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }
        
       
        System.out.println("Vetor B (com os elementos de A invertidos):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
        
        scanner.close();
    }
}
