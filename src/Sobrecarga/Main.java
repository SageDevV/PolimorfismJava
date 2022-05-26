package Sobrecarga;

public class Main {

    public static void main(String[] args) {
        Televisor tv = new Televisor(1);
        tv.setMarca("Philips");
        tv.mostrarDados();

        DVD dvd = new DVD(2);
        dvd.setPreco(20.00);
        dvd.setTituto("Gente Grande 2");
        dvd.mostrarDados();

    }
}
