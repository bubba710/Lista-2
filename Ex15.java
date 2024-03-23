import java.util.Scanner;

public class Ex15 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Digite os 5 números do vetor:");
        vetor[0] = scanner.nextInt(); 
        
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o próximo número:");
            int numero = scanner.nextInt();
       
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido! Digite um número maior que o anterior.");
                i--; 
            }
        }
        
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}
