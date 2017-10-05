/*
Faça uma função recursiva que converta um número na base 10 para a base 2
*/
package POTA01;

public class Q05 {

    public static void main(String[] args) {
        converteBase10Para2(183);
    }

    private static void converteBase10Para2(int n) {
        if (n > 0) {
            converteBase10Para2(n / 2);
            System.out.println(n % 2);
        }
    }
}