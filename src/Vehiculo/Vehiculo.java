
package Vehiculo;
// PARTE DE ABSTRACCION, SEGUNE EL ENUNCIADO ENETNDI QUE EMPIEZA ASI
public abstract class Vehiculo {
        // ESTO ES LA PARTE DE ENCAPSULACION
    private String marca;
    private String modelo;
    private Double  tarifabase; 
    // CONSTRUCTORES
public Vehiculo (){
}
    public Vehiculo(String marca, String modelo, Double tarifabase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifabase = tarifabase;
    }
// GET AND SEET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getTarifabase() {
        return tarifabase;
    }

    public void setTarifabase(Double tarifabase) {
        this.tarifabase = tarifabase;
    }
    
  
    }
    

