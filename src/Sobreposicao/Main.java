package Sobreposicao;

public class Main {
    public static void main(String[] args){
        Televisor tv = new Televisor();
        DVD dvd = new DVD();
        tv.setMarca("Philips");
        tv.mostrarDados();

        dvd.setTitulo("Gente Grande 2");
        dvd.setPreco(20.00);
        dvd.mostrarDados();
        System.out.println("-------------------------------");

    }
}
