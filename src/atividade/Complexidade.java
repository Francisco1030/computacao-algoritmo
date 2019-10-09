package atividade;

public class Complexidade {
    // O(1)
    int soma(int a, int b){
       return a + b;
    }

    int sub(int a, int b){
        return a - b;
    }

    int div(int a, int b){
        return a / b;
    }

    // O(N)
    static int soma(int[] a){
        int n = a.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total += i + n;
        }
        return total;
    }

    static int sub(int[] a){
        int n = a.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total -= i + n;
        }
        return total;
    }

    static int div(int[] a){
        int n = a.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total -= i + n;
        }
        return total;
    }

    // O(n^2)
    static int soma2(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                total += a[i] + a[j];
            }
        }
        return total;
     }

    static int sub2(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                total -= a[i] + a[j];
            }
        }
        return total;
    }

    static int div2(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                total /= a[i] + a[j];
            }
        }
        return total;
    }

    // O(n^3)
    static int soma3(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for (int k = 0; k < a.length; k++){
                    total += a[i] + a[j] + a[k];
                }
            }
        }
        return total;
    }

    static int sub3(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for (int k = 0; k < a.length; k++){
                    total -= a[i] + a[j] + a[k];
                }
            }
        }
        return total;
    }

    static int div3(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                for (int k = 0; k < a.length; k++){
                    total /= a[i] + a[j] + a[k];
                }
            }
        }
        return total;
    }

    // O(NlogN)
    static void shellSort(int[] vet){
        int i , j , temp, size = vet.length;

        int incremento = 1;
        while(incremento < size) {
            incremento = 3 * incremento + 1;
        }

        while (incremento > 1) {
            incremento /= 3;

            for(i = incremento; i < size; i++) {
                temp = vet[i];
                j = i - incremento;
                while (j >= 0 && temp > vet[j]) {
                    vet[j + incremento] = vet[j];
                    j -= incremento;
                }
                vet [j + incremento] = temp;
            }
        }
    }

    public static void quickSort(int lista[], int ini, int fim) {
        if (ini < fim) {
            int posdiv = particao(lista, ini, fim);
            quickSort(lista, ini, posdiv );
            quickSort(lista , posdiv + 1, fim);
        }
    }

    static int particao(int lista[], int ini, int fim) {
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

    static void troca(int lista[], int p, int q) {
        int x = lista[p];
        lista[p] = lista[q];
        lista[q] = x;
    }

    static void mergeSortString(String vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortString(vetor, inicio, meio);
            mergeSortString(vetor, meio + 1, fim);
            intercalaString(vetor, inicio, meio, fim);
        }
    }

    static void intercalaString(String v[], int inicio, int meio, int fim) {
        for (int i = meio; i <= fim; i++) {
            String x = v[i];
            for (int j = i - 1; j >= inicio; j--)
                if (!(x.compareTo(v[i]) == 0) && !(x.compareTo(v[i]) == 1)) {
                    v[j + 1] = v[j];
                    v[j] = x;
                }
                else {
                    v[j + 1] = x;
                    break;
                }
        }
    }

}
