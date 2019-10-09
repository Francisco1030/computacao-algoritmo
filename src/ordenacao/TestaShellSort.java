package ordenacao;

public class TestaShellSort {
    public static void main(String[] args) {
        int[] vetor = {54,26,93,17,77,31,44,55,20};
       // int[] vetor = {5,2,1};
         ShellSort.ordenar(vetor);

        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
