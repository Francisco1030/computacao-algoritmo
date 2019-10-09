package atividade;

public class QuickSortDesc {

    private static void quicksort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q);
            quicksort(A, q + 1, r);
        }
    }

    private static int partition(int[] A, int p, int r) {
        int x = A[p];
        int i = p;
        int j = r;
        while(true) {
            while (A[i] > x) {
                i++;
            }
            while (A[j] < x) {
                j--;
            }

            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            } else {
                return j;
            }
        }
    }


    public static void imprimir(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {54,26,93,17,77,31,44,55,20};
        QuickSortDesc.quicksort(vetor, 0, vetor.length-1);
        QuickSortDesc.imprimir(vetor);
    }
}
