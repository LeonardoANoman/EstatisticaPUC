package FuncoesUtil;

/*
* Classe utilitária para resolver fatorial com simplificação.
* A existência dessa classe da ao fato do Java não conseguir processar Fat>19.
* Exemplo: 20!/15! = 20 * 19 * 18 * 17 * 16
*/

public class FatorialSimplificado {
    public static long fatorialSimplificado(int x, int y) {
        int z = x - y;
        int fat = 1;
        for (int i = z + 1; i <= x; i++) {
            fat *= i;
        }
        return fat;
    }

}
