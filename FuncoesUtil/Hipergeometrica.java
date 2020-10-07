package FuncoesUtil;

/*
 * Distribuição Hipergeométrica. 
 * Fórmula Original: 
 * P(X = x) = ( A )   (N - A)
 *            ( x ) * (n - x)
 *            ----------------
 *                 ( N )
 *                 ( n )
 */

public class Hipergeometrica {
    public static double hipergeometrica(int N, int A, int n, int x) {
        double resposta = Combinacao.combinacao(A, x) * Combinacao.combinacao(N - A, n - x);
        return resposta / Combinacao.combinacao(N, n);
    }
}
