package ordenacao;

public class TesteSelecao {

    public static void main( String args[] ) {
        String v[] = {"Ze", "Bruno", "Antonio"};
        Selecao.selecaoDecrescente(v, v.length);
        Selecao.imprimir(v);
        Selecao.selecaoCrescente(v, v.length);
        Selecao.imprimir(v);
    }

}