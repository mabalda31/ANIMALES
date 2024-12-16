/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alejo
 */
public class Reptil extends Animal {
    public String tipoEscamas;

    public Reptil(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }

    public void arrastrarse() {
        System.out.println(nombre + " se esta arrastrando con sus escamas de tipo " + tipoEscamas + "");
    }
}