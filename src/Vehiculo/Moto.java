/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author IDEADPAD SLIM 3F6LM
 */
public class Moto extends Vehiculo {

    private static final double RECARGO_CASCO = 5.0;
    
    public Moto(String marca, String modelo, Double tarifaBase){
        super (marca, modelo,tarifaBase);
    }
    
    @Override
    public double calcularCostoAlquiler(int dias) {
        return (getTarifabase()* dias)+ RECARGO_CASCO;
    }
    
}
