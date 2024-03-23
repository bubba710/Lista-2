import java.util.Scanner;

public class Ex3 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor para a posição " + i + " do vetor: ");
            vetorOriginal[i] = scanner.nextInt();
            vetorDobro[i] = vetorOriginal[i] * 2;
        }
        
        System.out.println("Valores do vetor dobrados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorDobro[i]);
        }
        
        scanner.close();
    }
}
