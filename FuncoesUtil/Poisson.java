package FuncoesUtil;

/*
 * Distribuição de Poisson 
 * Fórmula Original: 
 * P(X = x) = (e^-l * l^x)/x! 
 * Sendo l = lambda
 */
public class Poisson {
    public static double poisson(float lambda, int x) {
        double p = Math.pow(Math.E, lambda);
        p = p * Math.pow(lambda, x);
        p = p / Fatorial.fatorial(x);
        return p;
    }

}