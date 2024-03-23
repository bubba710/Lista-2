import java.util.Scanner;

public class Ex13 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número n para os primeiros termos da sequência de Fibonacci:");
        int n = scanner.nextInt();
        
        int[] fibonacci = new int[n];
        
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        
        scanner.close();
    }
}
