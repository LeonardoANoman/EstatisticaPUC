package FuncoesUtil;

/*
 * Distribuição Exponencial 
 * Fórmula Original, contagem sucessiva de Poisson: 
 * P(X = x) = (e^-l * l^x) / x!
 * 
 * Fórmula Original, função acumulada: 
 * P(X < x) = F (x) = 1 - e^-lx
 * 
 * Sendo l = lambda
 */
public class Exponencial {
    public static double exponencialFuncao(float x, float lambda) {
        return lambda * Math.pow(Math.E, -lambda * x);
    }

    public static double exponencialSomatorio(float x, float lambda) {
        return 1 - Math.pow(Math.E, -lambda * x);
    }
}