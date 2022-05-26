package Inclusao;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor(1);
        tv.setMarca("Philips");
        cadastroProdutos cP = new cadastroProdutos(tv);
        cP.mostrarDadosdosProduto();
    }
}
