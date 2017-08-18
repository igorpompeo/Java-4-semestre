package funcaorecursiva;

public class MultiplicacaoRecursiva {

    public static void main(String[] args) {
        System.out.println(funcao(-6, -30));
    }

    public static int funcao(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b == 1) {
            return a;
        }
        if (b > 1) {
            return a + funcao(a, b - 1);
        }
        return -a + funcao(a, b + 1);
    }

}
