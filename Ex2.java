import java.util.Scanner;

public class Ex2 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor para a posição " + i + " do vetor: ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número na posição " + i + ": " + vetor[i] + " - ");
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        
        scanner.close();
    }
}
