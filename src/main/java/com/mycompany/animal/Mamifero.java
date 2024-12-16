/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author alejo
 */
public class Mamifero extends Animal {
    public String tipoPelaje;

    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
    }

    public void amamantarCrias() {
        System.out.println(nombre + " esta amamantando a sus crias");
    }
}