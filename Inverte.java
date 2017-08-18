package inverte;
public class Inverte {

    public static void main() {
        int vetor[] = {87, 43, 65, 100, 35, 21};
        inverte(vetor, 0, vetor.length - 1);
        for (int j = 0; j < 10; j++) {
            System.out.println(vetor[j] + " ");
        }
    }

    public static void inverte(int[] vetor, int i, int j) {
        if (j == 0) {
            vetor[i] = vetor[j];
        } else {
            int m = vetor[j];
            inverte(vetor, i + 1, j - 1);
            vetor[i] = m;
        }
    }

}
