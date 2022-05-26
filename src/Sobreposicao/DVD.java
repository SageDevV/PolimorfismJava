package Sobreposicao;

public class DVD extends Produto{
    private String titulo;
    private double preco;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void mostrarDados(){
        System.out.println("Sou da classe DVD, titulo: " + titulo + " preco: " + preco);
    }
}
