public class Main {
    public static void main(String[] args) {
        int resultado = fatorial(5);
        System.out.println(resultado);

        mostraPares(20);
    }

    public static int fatorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void mostraPares(int n){
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}

