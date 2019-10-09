package insercao;

public class UsaInsertSort {
    public static void main(String[] args) {
        InsertSort i = new InsertSort();
        int[] listaCre = {10,9,8,7,6,5,4,3,2,1,0};
        int[] listaDesc = {0,1,2,3,4,5,6,7,8,9,10};

        i.insercaoDecrescente(listaDesc);
        i.imprimir(listaDesc);
        System.err.println("==================================");
        i.insercaoCrescente(listaCre);
        i.imprimir(listaCre);
    }
}
