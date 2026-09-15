
package Vehiculo;
// PARTE DE ABSTRACCION, SEGUNE EL ENUNCIADO ENETNDI QUE EMPIEZA ASI
public abstract class Vehiculo {
        // ESTO ES LA PARTE DE ENCAPSULACION
    private String marca;
    private String modelo;
    private double  tarifabase; 
    // CONSTRUCTORES
public Vehiculo (){
}
    public Vehiculo(String marca, String modelo, double tarifabase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifabase = tarifabase;
    }
// GET sin SEET pq no se debe modificar de afuera
    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public double getTarifabase() {
        return tarifabase;
    }

    public abstract double calcularCostoAlquiler(int dias);
}
  
    
    

