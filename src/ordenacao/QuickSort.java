package ordenacao;

public class QuickSort {

    public static void quickSort(int lista[], int ini, int fim) {
        if (ini < fim) {
            int posdiv = particao(lista, ini, fim);
            quickSort(lista, ini, posdiv );
            quickSort(lista , posdiv + 1, fim);
        }
    }

    public static int particao(int lista[], int ini, int fim) {
        int pivot = lista[ini];
        int esq = ini + 1, dir = fim;
        while (dir >= esq) {
            while (esq <= dir && lista[esq] <= pivot) esq++;
            while (lista[dir] >= pivot && dir >= esq) dir--;
            if (dir >= esq) troca(lista, esq, dir);
        }
        troca(lista, ini, dir);
        return dir;
    }

    public static void troca(int lista[], int p, int q) {
        int x = lista[p];
        lista[p] = lista[q];
        lista[q] = x;
    }

    public static void imprimir(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {54,26,93,17,77,31,44,55,20};
        QuickSort.quickSort(vetor, 0, 8);
        QuickSort.imprimir(vetor);
    }
}
