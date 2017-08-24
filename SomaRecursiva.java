public class SomaRecursiva {
    public static void main(String[] args) {
        System.out.println(somaRecursiva(1234));
    }
    
    static int somaRecursiva(int n){
        int quociente = n / 10;
        int resto = n % 10;
        if (quociente == 0)
            return resto;
        return  resto + somaRecursiva(quociente);
    }
}
