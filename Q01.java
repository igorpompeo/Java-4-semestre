/*
Crie um programa que leia dois números, a base e o expoente, e apresente a 
potência entre esses números.
*/
package POTA01;

import javax.swing.JOptionPane;

public class Q01 {

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));
        if (expoente >= 0) {
            JOptionPane.showMessageDialog(null, "O resultado da potência é " + potencia(base, expoente));
        } else {
            expoente = expoente * -1;
            JOptionPane.showMessageDialog(null, "O resultado da potência é 1/" + potencia(base, expoente));
        }
    }

    /**
     * Calcula a potencia de um número
     * @param base Base da potência
     * @param expoente Expoente da potência
     * @return Potência de base elevado a expoente
     */
    private static double potencia(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }

}
