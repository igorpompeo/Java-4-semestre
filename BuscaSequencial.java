/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscasequencial;

public class BuscaSequencial {

    public static void main(String[] args) {
        int v[] = {23,34,65,87,0,3,55,82,47,99};
        System.out.println("Indice: " + buscaRecursiva(v, 0, 82));
    }
    public static int buscaRecursiva(int[] vetor, int m, int k){
        if (vetor[m] == k) {
                return m;
            } else if (m == vetor.length){
                return -1;
            } else {
                return buscaRecursiva(vetor, m + 1, k);
            }
    }
    
}
