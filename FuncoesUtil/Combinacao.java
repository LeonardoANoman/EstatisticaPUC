package FuncoesUtil;

/*
 * Classe utilitária para resolver combinação Cn,p.
 */

public class Combinacao {
    public static double combinacao(int x, int y) {
        double num, div = 0;
        num = FatorialSimplificado.fatorialSimplificado(x, y);
        div = Fatorial.fatorial(y);
        return num / div;
    }
}
