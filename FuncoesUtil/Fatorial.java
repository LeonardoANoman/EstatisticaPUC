package FuncoesUtil;

/**
 * Classe utilitária para resolver fatorial iterativamente.
 */

public class Fatorial {
    public static long fatorial(int x) {
        int fat = 1;
        for (int i = 1; i <= x; i++) {
            fat *= i;
        }
        return fat;
    }
}
