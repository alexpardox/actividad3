/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad3;

/**
 *
 * @author alexpardox
 */
// ProgramaPrincipal.java
public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        // Creamos una instancia de Deck, lo mezclamos y mostramos ejemplos de uso.
        Deck miMazoPoker = new Deck();

        // 1. Mezclar el mazo
        System.out.println("=== SHUFFLE ===");
        miMazoPoker.shuffle();

        // 2. Sacar la primera carta (head)
        System.out.println("=== HEAD ===");
        miMazoPoker.head();

        // 3. Sacar una carta al azar (pick)
        System.out.println("=== PICK ===");
        miMazoPoker.pick();

        // 4. Repartir una mano de cinco cartas (hand)
        System.out.println("=== HAND ===");
        miMazoPoker.hand();

        // 5. Mostrar cuántas cartas quedan en el mazo después de las operaciones
        System.out.println("Cartas restantes en el mazo: " + miMazoPoker.obtenerCartasRestantes());
    }
}
