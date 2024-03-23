import java.util.Scanner;

public class Ex5 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();
        
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }
        
        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");
        
        scanner.close();
    }
}
