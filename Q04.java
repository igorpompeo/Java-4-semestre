/*
Encontrar o valor do maior elemento de um vetor de inteiros de tamanho n 
(informado pelo usuário).
*/
package POTA01;

public class Q04 {

    public static void main(String[] args) {
        int vetor[] = {5, 98, 0, -4, 86, 35, 6, 87, 43, 65, 35};
        int tamanho = vetor.length;
        int maior = maior(vetor, tamanho - 1);
        System.out.println("O maior valor do vetor é " + maior);
    }

    /**
     * Calcula o maior elemento do vetor
     * @param vetor vetor com os valores
     * @param n quantidade de elementos do vetor
     * @return o maior elemento do vetor
     */
    private static int maior(int[] vetor, int n) {
        if (n == 0) {
            return vetor[0];
        } else {
            int m = maior(vetor, n - 1);
            if (m > vetor[n]) {
                return m;
            } else {
                return vetor[n];
            }
        }
    }
}
