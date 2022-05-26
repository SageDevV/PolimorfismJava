package Inclusao;

public class Televisor extends Produto {
    private String marca;

    public Televisor(int id){
        super(id);
    }
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void mostrarDados(){

        System.out.println("Sou da classe Televisor, id: " + id + " marca: " + getMarca());
    }
}
