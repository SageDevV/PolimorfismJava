package Sobreposicao;

public class Televisor extends Produto{
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarDados(){
        System.out.println("Sou da classe Televisor, marca: " + marca);
    }
}
