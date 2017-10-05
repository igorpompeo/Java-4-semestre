package POTA01;

import javax.swing.JOptionPane;

public class Q07 {

    public static void main(String[] args) {
        int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"))];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        }
        JOptionPane.showMessageDialog(null, "A soma dos elementos do vetor é " + soma(vetor, vetor.length));
    }

    private static int soma(int[] vetor, int n) {
        if (n == 1) {
            return vetor[0];
        } else {
            return vetor[n - 1] + soma(vetor, n - 1);
        }
    }
}
