package ordenacao;

public class Selecao {

    public static void selecaoCrescente(String v[], int tamanho) {
        if (tamanho > 0) {
            int p = buscaMaiorValor(v, tamanho);
            if (p < tamanho-1) {
                String x = v[p];
                v[p] = v[tamanho-1];
                v[tamanho-1] = x;
            }
            selecaoCrescente(v, tamanho-1);
        }
    }

    public static void selecaoDecrescente(String v[], int tamanho) {
        if (tamanho > 0) {
            int p = buscaMenorValor(v, tamanho);
            if (p < tamanho-1) {
                String x = v[p];
                v[p] = v[tamanho-1];
                v[tamanho-1] = x;
            }
            selecaoDecrescente(v, tamanho-1);
        }
    }

    public static int buscaMaiorValor(String v[], int tamanho) {
        int r = 0;
        for(int p = 1; p < tamanho; p++) {
            if (v[p].compareTo(v[r]) == 1) {
                r = p;
            }
        }
        return r;
    }

    public static int buscaMenorValor(String v[], int tamanho) {
        int r = 0;
        for(int p = 1; p < tamanho; p++) {
            if (!(v[p].compareTo(v[r]) == 1)) {
                r = p;
            }
        }
        return r;
    }

    public static void imprimir(String v[]){
        for ( int i = 0; i < v.length; i++ ) {
            System.out.println("V[" + i + "]=" + v[i]);
        }
    }

}
