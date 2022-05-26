package Inclusao;

public class cadastroProdutos {
    public Produto produto;

    public cadastroProdutos(Produto p) {
        this.produto = p;
    }
    public void mostrarDadosdosProduto(){
        produto.mostrarDados();
    }
}
