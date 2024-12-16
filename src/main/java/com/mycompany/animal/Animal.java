/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

public class Animal {
    public String nombre;
    public int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }
}