package teste_bbsort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Teste_BBSort {

    public static void main(String[] args) {
        int v[] = new int[]{25, 57, 48, 37, 12, 92, 86, 33};
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição: "+ (i+1) + " = " + v[i]);
        }

        System.out.println("=====================================");
        
        embaralha(v);

        int[] vetorEmbaralhado = v.clone();
        long tempoInicial = System.nanoTime();
        bubbleSort(vetorEmbaralhado);
        System.out.println(Arrays.toString(vetorEmbaralhado));
        long tempoFinal = System.nanoTime();
        System.out.println("Bubble iterativo: " + (tempoFinal - tempoInicial) + 
        "ns" + " - " + TimeUnit.MILLISECONDS.convert((tempoFinal - tempoInicial)
                , TimeUnit.NANOSECONDS) + "ms");
    }

    static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length-1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    swap(vetor, j, j + 1);
                    for (int k : vetor) {
                        System.out.print(k + "-");
                    }
                }
                System.out.println(" ");
            }
        }
    }
    
    private static void embaralha(int[] embaralhado) {
        Random random = new Random();
        int elementosRestantes = embaralhado.length;
        while (elementosRestantes > 0) {
            int k = random.nextInt(elementosRestantes);

            elementosRestantes--;
            swap(embaralhado, elementosRestantes, k);
        }
    }

    static void swap(int[] vetor, int x, int y) {
        int temp = vetor[x];
        vetor[x] = vetor[y];
        vetor[y] = temp;
    }
}
