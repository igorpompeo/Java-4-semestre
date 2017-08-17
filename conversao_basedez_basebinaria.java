package conversao_basedez_basebinaria;

import java.util.Scanner;

public class Conversao_baseDez_baseBinaria {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        n = scan.nextInt();
        conversaoBinaria(n);
    }

    public static void conversaoBinaria(int n) {
        if (n > 0) {
            conversaoBinaria(n / 2);
            System.out.println("Seu valor em binário é: "+n % 2);
        }
    }

}
