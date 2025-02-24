package com.registro;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Set<String> estudiantes = new HashSet<>();

        System.out.print("Ingrese la cantidad de estudiantes a registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            estudiantes.add(nombre);
        }
        
        System.out.println("\n Lista de Estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        System.out.print("\nIngrese el nombre del estudiante a buscar: ");
        String nombreBuscar = scanner.nextLine();

        if (estudiantes.contains(nombreBuscar)) {
            System.out.println(" El estudiante " + nombreBuscar + " está registrado.");
        } else {
            System.out.println(" El estudiante " + nombreBuscar + " NO está en la lista.");
        }

        scanner.close();
    }
}