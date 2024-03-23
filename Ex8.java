public class Ex8 {
    public static void executar(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {6, 7, 8, 9, 10};
        
        int[] vetorC = new int[vetorA.length + vetorB.length];
        
       
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        
       
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }
        
        // Imprimindo o vetor C
        System.out.println("Vetor C (concatenação de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
