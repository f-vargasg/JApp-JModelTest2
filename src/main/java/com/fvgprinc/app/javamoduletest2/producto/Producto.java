/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvgprinc.app.javamoduletest2.producto;

import com.fvgprinc.app.javamoduletest2.descuentoProd.Descuento;

/**
 *
 * @author garfi
 */
public class Producto {
    
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private double  precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    public double getDescuento () {
        return Descuento.calculaDescuento(this.precio);
    }
    
    public void EjecutarProceso()
    {
        double valor = 2;
        double valor1 = 0;
        
        double valorFinal = valor / valor1;
    }
    
    
}
