
package Vehiculo;
public class Auto extends Vehiculo {
// para todos los carros todos los dias 10 y  si quiero se cambia aski
    private static final double recargoadicionalpordia = 10;
    public Auto() {
    }

    public Auto(String marca, String modelo, Double tarifabase) {
        super(marca, modelo, tarifabase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
       
        return (dias* getTarifabase())+ ( recargoadicionalpordia* dias);
       
    }

}