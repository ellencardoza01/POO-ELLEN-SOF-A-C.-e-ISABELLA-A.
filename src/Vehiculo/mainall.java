package Vehiculo;

public class mainall {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", "Corolla", 30.0);
        double costoAuto = auto1.calcularCostoAlquiler(5);
        System.out.println("Auto: " + auto1.getMarca() + " " + auto1.getModelo()
                + " - Costo: " + costoAuto);

        Moto moto1 = new Moto("Honda", "CB190R", 15.0);
        double costoMoto = moto1.calcularCostoAlquiler(5);
        System.out.println("Moto: " + moto1.getMarca() + " " + moto1.getModelo()
                + " - Costo: " + costoMoto);
    }
}