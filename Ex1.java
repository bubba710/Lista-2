import java.util.Scanner;

public class Ex1 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / 5.0;
        
        System.out.println("Valores menores que a média:");
        for (int numero : numeros) {
            if (numero < media) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
        
        System.out.println("Valores iguais à média:");
        for (int numero : numeros) {
            if (numero == media) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
        
        System.out.println("Valores superiores à média:");
        for (int numero : numeros) {
            if (numero > media) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
