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
// Deck.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    // Atributo que contiene las cartas disponibles en el mazo
    private List<Card> mazoCartas;
    // Atributo que contiene las cartas que ya han sido usadas (removidas)
    private List<Card> cartasUsadas;

    // Constructor de Deck: inicializa las listas y crea las 52 cartas
    public Deck() {
        mazoCartas = new ArrayList<>();
        cartasUsadas = new ArrayList<>();
        inicializarMazo();
    }

    // 5. Inicializar las 52 cartas de poker y almacenarlas en 'mazoCartas'
    private void inicializarMazo() {
        String[] palos = { "Tréboles", "Corazones", "Picas", "Diamantes" };
        String[] valores = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K" };

        for (String paloActual : palos) {
            // Definir color según el palo
            String colorActual = (paloActual.equals("Corazones") || paloActual.equals("Diamantes")) 
                                     ? "Rojo" 
                                     : "Negro";
            // Crear una carta por cada valor
            for (String valorActual : valores) {
                Card carta = new Card(paloActual, colorActual, valorActual);
                mazoCartas.add(carta);
            }
        }
    }

    // 6.a) shuffle: mezclar el deck e imprimir mensaje
    public void shuffle() {
        Collections.shuffle(mazoCartas);
        System.out.println("Se mezcló el Deck.");
    }

    // 6.b) head: mostrar y remover la primera carta del deck
    public Card head() {
        if (mazoCartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        Card primeraCarta = mazoCartas.remove(0);
        cartasUsadas.add(primeraCarta);
        System.out.println(primeraCarta);                  // Imprime "{Palo},{Color},{Valor}"
        System.out.println("Quedan " + mazoCartas.size()); // Imprime "Quedan {número de cartas}"
        return primeraCarta;
    }

    // 6.c) pick: seleccionar una carta al azar y removerla
    public Card pick() {
        if (mazoCartas.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        Random generador = new Random();
        int indiceAleatorio = generador.nextInt(mazoCartas.size());
        Card cartaAleatoria = mazoCartas.remove(indiceAleatorio);
        cartasUsadas.add(cartaAleatoria);
        System.out.println(cartaAleatoria);                  // Imprime "{Palo},{Color},{Valor}"
        System.out.println("Quedan " + mazoCartas.size());   // Imprime "Quedan {número de cartas}"
        return cartaAleatoria;
    }

    // 6.d) hand: devolver un arreglo de cinco cartas y removerlas
    public Card[] hand() {
        if (mazoCartas.size() < 5) {
            System.out.println("No hay suficientes cartas para una mano de 5 cartas.");
            return null;
        }
        Card[] manoCincoCartas = new Card[5];
        for (int i = 0; i < 5; i++) {
            Card carta = mazoCartas.remove(0);
            cartasUsadas.add(carta);
            manoCincoCartas[i] = carta;
            System.out.println(carta); // Imprime cada carta en su propia línea
        }
        System.out.println("Quedan " + mazoCartas.size()); // Imprime "Quedan {número de cartas}"
        return manoCincoCartas;
    }

    // método para conocer cuántas cartas quedan en el mazo
    public int obtenerCartasRestantes() {
        return mazoCartas.size();
    }
}