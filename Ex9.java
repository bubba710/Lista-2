import java.util.Scanner;

public class Ex9 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        
        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os 5 elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // Posições pares
                vetorC[i] = vetorA[i];
            } else { // Posições ímpares
                vetorC[i] = vetorB[i];
            }
        }
        
        System.out.println("Vetor C:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }
        
        scanner.close();
    }
}
