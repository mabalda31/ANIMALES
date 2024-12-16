/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

import java.util.Scanner;

public class RelacionesAnimales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoAnimal;

        System.out.println("INGRESE EL NOMBRE DEL ANIMAL: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce la edad del animal: ");
        int edad = scanner.nextInt();

        // Escoger el tipo de animal
        System.out.println("ESCOGA UN TIPO DE ANIMAL DEL 1 AL 3");
        System.out.println("1. MAMIFERO");
        System.out.println("2. AVE");
        System.out.println("3. REPTIL");
        tipoAnimal = scanner.nextInt();

        // Limpiar el buffer
        scanner.nextLine();

        // Crear el animal segun la opcion seleccionada
        Animal animal = null;
        if (tipoAnimal == 1) {
            System.out.println("Introduce el tipo de pelaje del mamifero: ");
            String tipoPelaje = scanner.nextLine();
            animal = new Mamifero(nombre, edad, tipoPelaje);
        } else if (tipoAnimal == 2) {
            System.out.println("Introduce la envergadura de las alas del ave (en metros): ");
            double envergaduraAlas = scanner.nextDouble();
            animal = new Ave(nombre, edad, envergaduraAlas);
        } else if (tipoAnimal == 3) {
            System.out.println("Introduce el tipo de escamas del reptil: ");
            scanner.nextLine(); // Limpiar el buffer
            String tipoEscamas = scanner.nextLine();
            animal = new Reptil(nombre, edad, tipoEscamas);
        } else {
            System.out.println("Opcion no valida. Creando un animal generico.");
            animal = new Animal(nombre, edad);
        }

        // Mostrar el comportamiento del animal
        if (animal != null) {
            animal.comer();
            if (animal instanceof Mamifero) {
                ((Mamifero) animal).amamantarCrias();
            } else if (animal instanceof Ave) {
                ((Ave) animal).volar();
            } else if (animal instanceof Reptil) {
                ((Reptil) animal).arrastrarse();
            }
        }

        scanner.close();
    }
}