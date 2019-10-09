package ordenacao;

public class MergeSort {


    public static void mergeSortString(String vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortString(vetor, inicio, meio);
            mergeSortString(vetor, meio + 1, fim);
            intercalaString(vetor, inicio, meio, fim);
        }
    }

    public static void intercalaString(String v[], int inicio, int meio, int fim) {
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

    public static void imprimirString(String[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }


    public static void main(String[] args) {
//        int[] vetor = {54,26,93,17,77,31,44,55,20};
//        imprimirCrescenteInt(vetor);
//        mergeSortCrescenteInt(vetor,0,8);
//        System.out.println("================");
//        imprimirCrescenteInt(vetor);

        String vetorSting[] = {"F","E","D","C", "B", "A"};
        imprimirString(vetorSting);
        mergeSortString(vetorSting, 0, 2);
        System.out.println("================");
        imprimirString(vetorSting);
    }
}
