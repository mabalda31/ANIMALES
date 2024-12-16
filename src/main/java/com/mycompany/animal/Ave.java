/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alejo
 */
public class Ave extends Animal {
    public double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    public void volar() {
        System.out.println(nombre + " esta volando con una envergadura de " + envergaduraAlas + " metros");
    }
}