package insercao;

public class InsertSort {

    int valor;
    int pos;

    public void insercaoCrescente(int[] lista){
        for (int i = 1; i < lista.length; i++){
            valor = lista[i];
            pos = i;
            while (pos > 0 && lista[pos-1] > valor){
                lista[pos] = lista[pos-1];
                --pos;
            }
            lista[pos] = valor;
        }
    }

    public void insercaoDecrescente(int[] lista){
        for (int i = 1; i < lista.length; i++){
            valor = lista[i];
            pos = i;
            while (pos > 0 && lista[pos-1] < valor){
                lista[pos] = lista[pos-1];
                --pos;
            }
            lista[pos] = valor;
        }
    }

    public static void imprimir(int[] lista){
        for (int j = 0; j < lista.length; j++){
            System.out.println(lista[j] + " posi "+ j);
        }
    }
}
