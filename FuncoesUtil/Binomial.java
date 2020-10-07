package FuncoesUtil;

/*
 * Distribuição Binomial 
 * Fórmula Original: 
 * (n x) = n! / x! * (n -x)! * p^x * (1-p)^(n-x)
 */

public class Binomial {
    public static double binomial(int n, int x, float p) {
        double retorno = 0;
        retorno = Fatorial.fatorial(x) * Fatorial.fatorial(n - x);
        retorno = Fatorial.fatorial(n) / retorno;
        retorno *= Math.pow(p, x) * Math.pow(1 - p, n - x);
        return retorno;

    }
}
