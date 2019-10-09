package ordenacao;

public class ShellSort {

    public static void ordenar(int[] vet){
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
}
