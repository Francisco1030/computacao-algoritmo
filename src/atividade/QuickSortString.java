package atividade;

public class QuickSortString {

    private static void quicksort(String[] list, int p, int r) {
        if (p < r) {
            int q = partition(list,p,r);
            if (q == r) {
                q--;
            }
            quicksort(list,p,q);
            quicksort(list,q+1,r);
        }
    }

    private static int partition (String[] list, int p, int r) {
        String pivot = list[p];
        int lo = p;
        int hi = r;

        while (true) {
            while (list[hi].compareTo(pivot) >= 0 &&
                    lo < hi) {
                hi--;
            }
            while (list[lo].compareTo(pivot) < 0 &&
                    lo < hi) {
                lo++;
            }
            if (lo < hi) {
                String T = list[lo];
                list[lo] = list[hi];
                list[hi] = T;
            }
            else return hi;
        }
    }

    public static void imprimir(String[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        String vetor[] = {"F","E","D","C", "B", "A"};
        QuickSortString.quicksort(vetor, 0, vetor.length-1);
        QuickSortString.imprimir(vetor);
    }
}
