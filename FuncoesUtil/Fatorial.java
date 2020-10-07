package FuncoesUtil;

/**
 * Classe útil para resolver fatorial iterativamente.
 */

public class Fatorial {
    public static int fatorial(int x) {
        int fat = 1;
        for (int i = 1; i <= x; i++) {
            fat *= i;
        }
        return fat;
    }
}
