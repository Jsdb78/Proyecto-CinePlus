/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class ComboPalomitas extends Combo{
    public ComboPalomitas(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecioCombo() {
        return getPrecio();
    }
}
