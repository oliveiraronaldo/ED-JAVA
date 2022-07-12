public class AlgoritmosRecursivos {
    //1! -> 1
    //2! -> 2x1
    //3! - > 3x2x1
    //4! -> 4x3x2x1

    public static void fatorialIterativo(long fatorial){
        long resultado = 1;
        for (long i = fatorial; i >= 1; i--){
            resultado = resultado*i;
        }
        System.out.printf("Fatorial %d = %d", fatorial, resultado);
    }

    //1! -> 1
    //n! -> n x fatorial(n-1)
    //2! -> 2x1 == 2x1!
    //3! - > 3x2x1 == 3x2!
    //4! -> 4x3x2x1 == 4x3!



    public static int fatorialRecursivo(int n){
        if(n == 1){
            return 1;
        }
        return n* fatorialRecursivo(n-1);
    }
}
