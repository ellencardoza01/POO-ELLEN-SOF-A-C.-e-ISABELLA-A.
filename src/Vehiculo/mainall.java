package Vehiculo;

public class mainall {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Jeepeta", "Cuadrado", 325.5);
        Auto auto2 = new Auto("mazda", "triangular", 415.52);
        double costoAuto = auto1.calcularCostoAlquiler(5);
        double costoAuto2 = auto2.calcularCostoAlquiler(5);

        System.out.println("Auto: " + auto1.getMarca() + "-" + auto1.getModelo() + "-Costo: " + costoAuto);
        System.out.println("Auto: " + auto2.getMarca() + "-" + auto2.getModelo() + "-Costo: " + costoAuto2);
    }
}
