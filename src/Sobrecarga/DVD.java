package Sobrecarga;

public class DVD extends Produto{
    private String titulo;
    private double preco;


    public DVD(int id){
        super(id);
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTituto(String titulo){
        this.titulo = titulo;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void mostrarDados(){
        System.out.println("Sou da Classe DVD id: " + id + " titulo: " + getTitulo() + " preco: " + getPreco());
    }

}
